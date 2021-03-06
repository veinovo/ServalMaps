/*
 * Copyright (C) 2012 The Serval Project
 *
 * This file is part of the Serval Maps Software
 *
 * Serval Maps Software is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This source code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this source code; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.servalproject.maps.mapsforge;

import org.mapsforge.android.maps.overlay.ArrayItemizedOverlay;
import org.servalproject.maps.R;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.Toast;

/**
 * implement a Serval Maps specific overlay list
 */
public class OverlayList extends ArrayItemizedOverlay {
	
	// declare class level constants
	private final String TAG = "OverlayList";
	private final boolean V_LOG = false;
	
	// declare class level variables
	private Context context;
	
	
	/**
	 * construct a new overlay list
	 * 
	 * @param defaultMarker - the default marker (may be null). This marker is aligned to the center of its bottom line to allow for conical symbols such as a pin or a needle.
	 * @param context - the reference to the application context.
	 */
	public OverlayList(Drawable defaultMarker, Context context) {
		super(defaultMarker);
		
		this.context = context;
	}
	
	@Override
	public boolean onTap(int index) {
		
		OverlayItem mItem = (OverlayItem)this.createItem(index);
		Intent mIntent;
		//HashMap<String, String> mExtraInfo;
		
		//determine what item was chosen
		switch(mItem.getType()) {
		case OverlayItems.SELF_LOCATION_ITEM:
			if(V_LOG){
				Log.v(TAG, "user touched their own marker");
			}
			
			// show a toast showing their location
			String mToastText = String.format(context.getString(R.string.map_ui_toast_self_location), mItem.getLatitude(), mItem.getLongitude());
			
			Toast mToast = Toast.makeText(context, mToastText, Toast.LENGTH_LONG);
			mToast.show();
			break;
		case OverlayItems.PEER_LOCATION_ITEM:
			if(V_LOG){
				Log.v(TAG, "user touched a peer location marker");
			}
			
			// show the peer information activity
			mIntent = new Intent(context, org.servalproject.maps.PeerInfoActivity.class);
			mIntent.putExtra("recordId", mItem.getRecordId());
			context.startActivity(mIntent);
			
			break;
		case OverlayItems.POI_ITEM:
			if(V_LOG){
				Log.v(TAG, "user touched a poi marker");
			}
			
			// show the poi information activity
			mIntent = new Intent(context, org.servalproject.maps.PoiInfoActivity.class);
			mIntent.putExtra("recordId", mItem.getRecordId());
			context.startActivity(mIntent);
			break;
		default:
			Log.e(TAG, "unknown marker type");
			return false;
		}
		
		return true;
	}
	
	/*
	 * make sure we don't hold onto a reference to the context
	 * (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */

	@Override
	protected void finalize() throws Throwable{
		context = null;
		super.finalize();
	}

}
