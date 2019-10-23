// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access.proto

package org.spin.grpc.util;

public interface SessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:access.Session)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string uuid = 2;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.access.UserInfo userInfo = 4;</code>
   */
  boolean hasUserInfo();
  /**
   * <code>.access.UserInfo userInfo = 4;</code>
   */
  org.spin.grpc.util.UserInfo getUserInfo();
  /**
   * <code>.access.UserInfo userInfo = 4;</code>
   */
  org.spin.grpc.util.UserInfoOrBuilder getUserInfoOrBuilder();

  /**
   * <code>.access.Role role = 5;</code>
   */
  boolean hasRole();
  /**
   * <code>.access.Role role = 5;</code>
   */
  org.spin.grpc.util.Role getRole();
  /**
   * <code>.access.Role role = 5;</code>
   */
  org.spin.grpc.util.RoleOrBuilder getRoleOrBuilder();

  /**
   * <code>bool processed = 6;</code>
   */
  boolean getProcessed();

  /**
   * <code>map&lt;string, .access.ContextValue&gt; defailtContext = 7;</code>
   */
  int getDefailtContextCount();
  /**
   * <code>map&lt;string, .access.ContextValue&gt; defailtContext = 7;</code>
   */
  boolean containsDefailtContext(
      java.lang.String key);
  /**
   * Use {@link #getDefailtContextMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.spin.grpc.util.ContextValue>
  getDefailtContext();
  /**
   * <code>map&lt;string, .access.ContextValue&gt; defailtContext = 7;</code>
   */
  java.util.Map<java.lang.String, org.spin.grpc.util.ContextValue>
  getDefailtContextMap();
  /**
   * <code>map&lt;string, .access.ContextValue&gt; defailtContext = 7;</code>
   */

  org.spin.grpc.util.ContextValue getDefailtContextOrDefault(
      java.lang.String key,
      org.spin.grpc.util.ContextValue defaultValue);
  /**
   * <code>map&lt;string, .access.ContextValue&gt; defailtContext = 7;</code>
   */

  org.spin.grpc.util.ContextValue getDefailtContextOrThrow(
      java.lang.String key);
}
