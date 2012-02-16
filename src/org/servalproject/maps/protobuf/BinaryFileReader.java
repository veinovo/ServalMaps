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
package org.servalproject.maps.protobuf;

import java.io.File;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/**
 * read a google protocol buffer based binary file
 * containing location or point of interest information
 */
public class BinaryFileReader {
	
	/*
	 * private class level constants
	 */
	private static final String TAG = "BinaryFileReader";
	//private static final boolean V_LOG = true;
	
	/**
	 * read a file containing location information and add it to the database
	 * 
	 * @param context
	 * @param filePath
	 */
	public static void readLocations(Context context, String filePath) {
		
		// check the parameters
		if(context == null) {
			throw new IllegalArgumentException("the context parameter is required");
		}
		
		if(TextUtils.isEmpty(filePath) == true) {
			throw new IllegalArgumentException("the filePath parameter is required");
		}
		
		if(testPath(filePath) == false) {
			Log.e(TAG, "invalid file path: " + filePath);
			return;
		}
		
		LocationReadWorker mWorker = new LocationReadWorker(context, filePath);
		Thread mWorkerThread = new Thread(mWorker, "LocationImportWorker");
		mWorkerThread.start();
	}

	
	// private method to test a path
	private static boolean testPath(String path) {
		
		File mFile = new File(path);
		
		if(mFile.isFile() && mFile.canRead()) {
			return true;
		} else {
			return false;
		}
	}

}
