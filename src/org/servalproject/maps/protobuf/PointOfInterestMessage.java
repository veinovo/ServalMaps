// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PointOfInterestMessage.proto

package org.servalproject.maps.protobuf;

public final class PointOfInterestMessage {
  private PointOfInterestMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string phoneNumber = 1;
    boolean hasPhoneNumber();
    String getPhoneNumber();
    
    // optional string subsciberId = 2;
    boolean hasSubsciberId();
    String getSubsciberId();
    
    // optional double latitude = 3;
    boolean hasLatitude();
    double getLatitude();
    
    // optional double longitude = 4;
    boolean hasLongitude();
    double getLongitude();
    
    // optional int64 timestamp = 5;
    boolean hasTimestamp();
    long getTimestamp();
    
    // optional string timeZone = 6;
    boolean hasTimeZone();
    String getTimeZone();
    
    // optional string title = 7;
    boolean hasTitle();
    String getTitle();
    
    // optional string description = 8;
    boolean hasDescription();
    String getDescription();
    
    // optional int64 category = 9;
    boolean hasCategory();
    long getCategory();
    
    // optional string photo = 10;
    boolean hasPhoto();
    String getPhoto();
  }
  public static final class Message extends
      com.google.protobuf.GeneratedMessage
      implements MessageOrBuilder {
    // Use Message.newBuilder() to construct.
    private Message(Builder builder) {
      super(builder);
    }
    private Message(boolean noInit) {}
    
    private static final Message defaultInstance;
    public static Message getDefaultInstance() {
      return defaultInstance;
    }
    
    public Message getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.servalproject.maps.protobuf.PointOfInterestMessage.internal_static_Message_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.servalproject.maps.protobuf.PointOfInterestMessage.internal_static_Message_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string phoneNumber = 1;
    public static final int PHONENUMBER_FIELD_NUMBER = 1;
    private java.lang.Object phoneNumber_;
    public boolean hasPhoneNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getPhoneNumber() {
      java.lang.Object ref = phoneNumber_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          phoneNumber_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPhoneNumberBytes() {
      java.lang.Object ref = phoneNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        phoneNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string subsciberId = 2;
    public static final int SUBSCIBERID_FIELD_NUMBER = 2;
    private java.lang.Object subsciberId_;
    public boolean hasSubsciberId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getSubsciberId() {
      java.lang.Object ref = subsciberId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          subsciberId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSubsciberIdBytes() {
      java.lang.Object ref = subsciberId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        subsciberId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional double latitude = 3;
    public static final int LATITUDE_FIELD_NUMBER = 3;
    private double latitude_;
    public boolean hasLatitude() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public double getLatitude() {
      return latitude_;
    }
    
    // optional double longitude = 4;
    public static final int LONGITUDE_FIELD_NUMBER = 4;
    private double longitude_;
    public boolean hasLongitude() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public double getLongitude() {
      return longitude_;
    }
    
    // optional int64 timestamp = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    private long timestamp_;
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public long getTimestamp() {
      return timestamp_;
    }
    
    // optional string timeZone = 6;
    public static final int TIMEZONE_FIELD_NUMBER = 6;
    private java.lang.Object timeZone_;
    public boolean hasTimeZone() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getTimeZone() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          timeZone_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTimeZoneBytes() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        timeZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string title = 7;
    public static final int TITLE_FIELD_NUMBER = 7;
    private java.lang.Object title_;
    public boolean hasTitle() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public String getTitle() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          title_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string description = 8;
    public static final int DESCRIPTION_FIELD_NUMBER = 8;
    private java.lang.Object description_;
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public String getDescription() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          description_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int64 category = 9;
    public static final int CATEGORY_FIELD_NUMBER = 9;
    private long category_;
    public boolean hasCategory() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public long getCategory() {
      return category_;
    }
    
    // optional string photo = 10;
    public static final int PHOTO_FIELD_NUMBER = 10;
    private java.lang.Object photo_;
    public boolean hasPhoto() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public String getPhoto() {
      java.lang.Object ref = photo_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          photo_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPhotoBytes() {
      java.lang.Object ref = photo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        photo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      phoneNumber_ = "";
      subsciberId_ = "";
      latitude_ = 0D;
      longitude_ = 0D;
      timestamp_ = 0L;
      timeZone_ = "";
      title_ = "";
      description_ = "";
      category_ = 0L;
      photo_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getPhoneNumberBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getSubsciberIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, latitude_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, longitude_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, timestamp_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getTimeZoneBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getTitleBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(8, getDescriptionBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt64(9, category_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBytes(10, getPhotoBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getPhoneNumberBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSubsciberIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, latitude_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, longitude_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, timestamp_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getTimeZoneBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getTitleBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, getDescriptionBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(9, category_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(10, getPhotoBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.servalproject.maps.protobuf.PointOfInterestMessage.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.servalproject.maps.protobuf.PointOfInterestMessage.Message prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.servalproject.maps.protobuf.PointOfInterestMessage.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.servalproject.maps.protobuf.PointOfInterestMessage.internal_static_Message_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.servalproject.maps.protobuf.PointOfInterestMessage.internal_static_Message_fieldAccessorTable;
      }
      
      // Construct using org.servalproject.maps.protobuf.PointOfInterestMessage.Message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        phoneNumber_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        subsciberId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        latitude_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        longitude_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        timeZone_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        title_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        description_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        category_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000100);
        photo_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.servalproject.maps.protobuf.PointOfInterestMessage.Message.getDescriptor();
      }
      
      public org.servalproject.maps.protobuf.PointOfInterestMessage.Message getDefaultInstanceForType() {
        return org.servalproject.maps.protobuf.PointOfInterestMessage.Message.getDefaultInstance();
      }
      
      public org.servalproject.maps.protobuf.PointOfInterestMessage.Message build() {
        org.servalproject.maps.protobuf.PointOfInterestMessage.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.servalproject.maps.protobuf.PointOfInterestMessage.Message buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.servalproject.maps.protobuf.PointOfInterestMessage.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.servalproject.maps.protobuf.PointOfInterestMessage.Message buildPartial() {
        org.servalproject.maps.protobuf.PointOfInterestMessage.Message result = new org.servalproject.maps.protobuf.PointOfInterestMessage.Message(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.phoneNumber_ = phoneNumber_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.subsciberId_ = subsciberId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.latitude_ = latitude_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.longitude_ = longitude_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.timeZone_ = timeZone_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.title_ = title_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.description_ = description_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.category_ = category_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.photo_ = photo_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.servalproject.maps.protobuf.PointOfInterestMessage.Message) {
          return mergeFrom((org.servalproject.maps.protobuf.PointOfInterestMessage.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.servalproject.maps.protobuf.PointOfInterestMessage.Message other) {
        if (other == org.servalproject.maps.protobuf.PointOfInterestMessage.Message.getDefaultInstance()) return this;
        if (other.hasPhoneNumber()) {
          setPhoneNumber(other.getPhoneNumber());
        }
        if (other.hasSubsciberId()) {
          setSubsciberId(other.getSubsciberId());
        }
        if (other.hasLatitude()) {
          setLatitude(other.getLatitude());
        }
        if (other.hasLongitude()) {
          setLongitude(other.getLongitude());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasTimeZone()) {
          setTimeZone(other.getTimeZone());
        }
        if (other.hasTitle()) {
          setTitle(other.getTitle());
        }
        if (other.hasDescription()) {
          setDescription(other.getDescription());
        }
        if (other.hasCategory()) {
          setCategory(other.getCategory());
        }
        if (other.hasPhoto()) {
          setPhoto(other.getPhoto());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              phoneNumber_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              subsciberId_ = input.readBytes();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              latitude_ = input.readDouble();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              longitude_ = input.readDouble();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              timestamp_ = input.readInt64();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              timeZone_ = input.readBytes();
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              title_ = input.readBytes();
              break;
            }
            case 66: {
              bitField0_ |= 0x00000080;
              description_ = input.readBytes();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              category_ = input.readInt64();
              break;
            }
            case 82: {
              bitField0_ |= 0x00000200;
              photo_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string phoneNumber = 1;
      private java.lang.Object phoneNumber_ = "";
      public boolean hasPhoneNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getPhoneNumber() {
        java.lang.Object ref = phoneNumber_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          phoneNumber_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPhoneNumber(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        phoneNumber_ = value;
        onChanged();
        return this;
      }
      public Builder clearPhoneNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        phoneNumber_ = getDefaultInstance().getPhoneNumber();
        onChanged();
        return this;
      }
      void setPhoneNumber(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        phoneNumber_ = value;
        onChanged();
      }
      
      // optional string subsciberId = 2;
      private java.lang.Object subsciberId_ = "";
      public boolean hasSubsciberId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getSubsciberId() {
        java.lang.Object ref = subsciberId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          subsciberId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSubsciberId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        subsciberId_ = value;
        onChanged();
        return this;
      }
      public Builder clearSubsciberId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        subsciberId_ = getDefaultInstance().getSubsciberId();
        onChanged();
        return this;
      }
      void setSubsciberId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        subsciberId_ = value;
        onChanged();
      }
      
      // optional double latitude = 3;
      private double latitude_ ;
      public boolean hasLatitude() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public double getLatitude() {
        return latitude_;
      }
      public Builder setLatitude(double value) {
        bitField0_ |= 0x00000004;
        latitude_ = value;
        onChanged();
        return this;
      }
      public Builder clearLatitude() {
        bitField0_ = (bitField0_ & ~0x00000004);
        latitude_ = 0D;
        onChanged();
        return this;
      }
      
      // optional double longitude = 4;
      private double longitude_ ;
      public boolean hasLongitude() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public double getLongitude() {
        return longitude_;
      }
      public Builder setLongitude(double value) {
        bitField0_ |= 0x00000008;
        longitude_ = value;
        onChanged();
        return this;
      }
      public Builder clearLongitude() {
        bitField0_ = (bitField0_ & ~0x00000008);
        longitude_ = 0D;
        onChanged();
        return this;
      }
      
      // optional int64 timestamp = 5;
      private long timestamp_ ;
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public long getTimestamp() {
        return timestamp_;
      }
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000010;
        timestamp_ = value;
        onChanged();
        return this;
      }
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000010);
        timestamp_ = 0L;
        onChanged();
        return this;
      }
      
      // optional string timeZone = 6;
      private java.lang.Object timeZone_ = "";
      public boolean hasTimeZone() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getTimeZone() {
        java.lang.Object ref = timeZone_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          timeZone_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTimeZone(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        timeZone_ = value;
        onChanged();
        return this;
      }
      public Builder clearTimeZone() {
        bitField0_ = (bitField0_ & ~0x00000020);
        timeZone_ = getDefaultInstance().getTimeZone();
        onChanged();
        return this;
      }
      void setTimeZone(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        timeZone_ = value;
        onChanged();
      }
      
      // optional string title = 7;
      private java.lang.Object title_ = "";
      public boolean hasTitle() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public String getTitle() {
        java.lang.Object ref = title_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          title_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTitle(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        title_ = value;
        onChanged();
        return this;
      }
      public Builder clearTitle() {
        bitField0_ = (bitField0_ & ~0x00000040);
        title_ = getDefaultInstance().getTitle();
        onChanged();
        return this;
      }
      void setTitle(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000040;
        title_ = value;
        onChanged();
      }
      
      // optional string description = 8;
      private java.lang.Object description_ = "";
      public boolean hasDescription() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public String getDescription() {
        java.lang.Object ref = description_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          description_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setDescription(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        description_ = value;
        onChanged();
        return this;
      }
      public Builder clearDescription() {
        bitField0_ = (bitField0_ & ~0x00000080);
        description_ = getDefaultInstance().getDescription();
        onChanged();
        return this;
      }
      void setDescription(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000080;
        description_ = value;
        onChanged();
      }
      
      // optional int64 category = 9;
      private long category_ ;
      public boolean hasCategory() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public long getCategory() {
        return category_;
      }
      public Builder setCategory(long value) {
        bitField0_ |= 0x00000100;
        category_ = value;
        onChanged();
        return this;
      }
      public Builder clearCategory() {
        bitField0_ = (bitField0_ & ~0x00000100);
        category_ = 0L;
        onChanged();
        return this;
      }
      
      // optional string photo = 10;
      private java.lang.Object photo_ = "";
      public boolean hasPhoto() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public String getPhoto() {
        java.lang.Object ref = photo_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          photo_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPhoto(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        photo_ = value;
        onChanged();
        return this;
      }
      public Builder clearPhoto() {
        bitField0_ = (bitField0_ & ~0x00000200);
        photo_ = getDefaultInstance().getPhoto();
        onChanged();
        return this;
      }
      void setPhoto(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000200;
        photo_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:Message)
    }
    
    static {
      defaultInstance = new Message(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:Message)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034PointOfInterestMessage.proto\"\302\001\n\007Messa" +
      "ge\022\023\n\013phoneNumber\030\001 \001(\t\022\023\n\013subsciberId\030\002" +
      " \001(\t\022\020\n\010latitude\030\003 \001(\001\022\021\n\tlongitude\030\004 \001(" +
      "\001\022\021\n\ttimestamp\030\005 \001(\003\022\020\n\010timeZone\030\006 \001(\t\022\r" +
      "\n\005title\030\007 \001(\t\022\023\n\013description\030\010 \001(\t\022\020\n\010ca" +
      "tegory\030\t \001(\003\022\r\n\005photo\030\n \001(\tB!\n\037org.serva" +
      "lproject.maps.protobuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Message_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Message_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Message_descriptor,
              new java.lang.String[] { "PhoneNumber", "SubsciberId", "Latitude", "Longitude", "Timestamp", "TimeZone", "Title", "Description", "Category", "Photo", },
              org.servalproject.maps.protobuf.PointOfInterestMessage.Message.class,
              org.servalproject.maps.protobuf.PointOfInterestMessage.Message.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
