// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package org.spin.grpc.util;

public interface ConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.Condition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.data.Value value = 1;</code>
   */
  boolean hasValue();
  /**
   * <code>.data.Value value = 1;</code>
   */
  org.spin.grpc.util.Value getValue();
  /**
   * <code>.data.Value value = 1;</code>
   */
  org.spin.grpc.util.ValueOrBuilder getValueOrBuilder();

  /**
   * <code>.data.Value valueTo = 2;</code>
   */
  boolean hasValueTo();
  /**
   * <code>.data.Value valueTo = 2;</code>
   */
  org.spin.grpc.util.Value getValueTo();
  /**
   * <code>.data.Value valueTo = 2;</code>
   */
  org.spin.grpc.util.ValueOrBuilder getValueToOrBuilder();

  /**
   * <code>repeated .data.Value values = 3;</code>
   */
  java.util.List<org.spin.grpc.util.Value> 
      getValuesList();
  /**
   * <code>repeated .data.Value values = 3;</code>
   */
  org.spin.grpc.util.Value getValues(int index);
  /**
   * <code>repeated .data.Value values = 3;</code>
   */
  int getValuesCount();
  /**
   * <code>repeated .data.Value values = 3;</code>
   */
  java.util.List<? extends org.spin.grpc.util.ValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <code>repeated .data.Value values = 3;</code>
   */
  org.spin.grpc.util.ValueOrBuilder getValuesOrBuilder(
      int index);

  /**
   * <pre>
   *	Operators
   * </pre>
   *
   * <code>.data.Condition.Operator operator = 4;</code>
   */
  int getOperatorValue();
  /**
   * <pre>
   *	Operators
   * </pre>
   *
   * <code>.data.Condition.Operator operator = 4;</code>
   */
  org.spin.grpc.util.Condition.Operator getOperator();
}
