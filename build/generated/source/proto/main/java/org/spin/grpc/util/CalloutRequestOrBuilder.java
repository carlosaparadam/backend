// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

public interface CalloutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.CalloutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.access.ClientRequest clientRequest = 1;</code>
   */
  boolean hasClientRequest();
  /**
   * <code>.access.ClientRequest clientRequest = 1;</code>
   */
  org.spin.grpc.util.ClientRequest getClientRequest();
  /**
   * <code>.access.ClientRequest clientRequest = 1;</code>
   */
  org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder();

  /**
   * <code>string callout = 2;</code>
   */
  java.lang.String getCallout();
  /**
   * <code>string callout = 2;</code>
   */
  com.google.protobuf.ByteString
      getCalloutBytes();

  /**
   * <code>.data.ValueObject valueObject = 3;</code>
   */
  boolean hasValueObject();
  /**
   * <code>.data.ValueObject valueObject = 3;</code>
   */
  org.spin.grpc.util.ValueObject getValueObject();
  /**
   * <code>.data.ValueObject valueObject = 3;</code>
   */
  org.spin.grpc.util.ValueObjectOrBuilder getValueObjectOrBuilder();
}
