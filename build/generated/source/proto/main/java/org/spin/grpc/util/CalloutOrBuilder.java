// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

public interface CalloutOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.Callout)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string result = 1;</code>
   */
  java.lang.String getResult();
  /**
   * <code>string result = 1;</code>
   */
  com.google.protobuf.ByteString
      getResultBytes();

  /**
   * <code>.data.Entity values = 2;</code>
   */
  boolean hasValues();
  /**
   * <code>.data.Entity values = 2;</code>
   */
  org.spin.grpc.util.Entity getValues();
  /**
   * <code>.data.Entity values = 2;</code>
   */
  org.spin.grpc.util.EntityOrBuilder getValuesOrBuilder();
}