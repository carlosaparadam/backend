// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

public interface CalloutResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.CalloutResponse)
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
   * <code>repeated .data.Value values = 2;</code>
   */
  java.util.List<org.spin.grpc.util.Value> 
      getValuesList();
  /**
   * <code>repeated .data.Value values = 2;</code>
   */
  org.spin.grpc.util.Value getValues(int index);
  /**
   * <code>repeated .data.Value values = 2;</code>
   */
  int getValuesCount();
  /**
   * <code>repeated .data.Value values = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.ValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <code>repeated .data.Value values = 2;</code>
   */
  org.spin.grpc.util.ValueOrBuilder getValuesOrBuilder(
      int index);
}
