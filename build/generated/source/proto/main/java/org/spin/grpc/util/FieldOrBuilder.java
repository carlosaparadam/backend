// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

public interface FieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dictionary.Field)
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
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string help = 5;</code>
   */
  java.lang.String getHelp();
  /**
   * <code>string help = 5;</code>
   */
  com.google.protobuf.ByteString
      getHelpBytes();

  /**
   * <code>int32 sequence = 6;</code>
   */
  int getSequence();

  /**
   * <code>string columnName = 7;</code>
   */
  java.lang.String getColumnName();
  /**
   * <code>string columnName = 7;</code>
   */
  com.google.protobuf.ByteString
      getColumnNameBytes();

  /**
   * <code>bool isDisplayed = 8;</code>
   */
  boolean getIsDisplayed();

  /**
   * <code>bool isDisplayedGrid = 9;</code>
   */
  boolean getIsDisplayedGrid();

  /**
   * <code>bool isReadOnly = 10;</code>
   */
  boolean getIsReadOnly();

  /**
   * <code>bool isAllowCopy = 11;</code>
   */
  boolean getIsAllowCopy();

  /**
   * <code>bool isEncrypted = 12;</code>
   */
  boolean getIsEncrypted();

  /**
   * <code>bool isSameLine = 13;</code>
   */
  boolean getIsSameLine();

  /**
   * <code>bool isHeading = 14;</code>
   */
  boolean getIsHeading();

  /**
   * <code>bool isFieldOnly = 15;</code>
   */
  boolean getIsFieldOnly();

  /**
   * <code>bool isQuickEntry = 16;</code>
   */
  boolean getIsQuickEntry();

  /**
   * <code>bool isMandatory = 17;</code>
   */
  boolean getIsMandatory();

  /**
   * <code>bool isKey = 18;</code>
   */
  boolean getIsKey();

  /**
   * <code>bool isParent = 19;</code>
   */
  boolean getIsParent();

  /**
   * <code>bool isUpdateable = 20;</code>
   */
  boolean getIsUpdateable();

  /**
   * <code>bool isIdentifier = 21;</code>
   */
  boolean getIsIdentifier();

  /**
   * <code>bool isAllowLogging = 22;</code>
   */
  boolean getIsAllowLogging();

  /**
   * <code>bool isSelectionColumn = 23;</code>
   */
  boolean getIsSelectionColumn();

  /**
   * <code>bool isRange = 24;</code>
   */
  boolean getIsRange();

  /**
   * <code>bool isAlwaysUpdateable = 25;</code>
   */
  boolean getIsAlwaysUpdateable();

  /**
   * <code>bool isTranslated = 26;</code>
   */
  boolean getIsTranslated();

  /**
   * <code>int32 identifierSequence = 77;</code>
   */
  int getIdentifierSequence();

  /**
   * <code>string displayLogic = 28;</code>
   */
  java.lang.String getDisplayLogic();
  /**
   * <code>string displayLogic = 28;</code>
   */
  com.google.protobuf.ByteString
      getDisplayLogicBytes();

  /**
   * <code>int32 displayType = 29;</code>
   */
  int getDisplayType();

  /**
   * <code>string defaultValue = 30;</code>
   */
  java.lang.String getDefaultValue();
  /**
   * <code>string defaultValue = 30;</code>
   */
  com.google.protobuf.ByteString
      getDefaultValueBytes();

  /**
   * <code>string readOnlyLogic = 31;</code>
   */
  java.lang.String getReadOnlyLogic();
  /**
   * <code>string readOnlyLogic = 31;</code>
   */
  com.google.protobuf.ByteString
      getReadOnlyLogicBytes();

  /**
   * <code>string mandatoryLogic = 32;</code>
   */
  java.lang.String getMandatoryLogic();
  /**
   * <code>string mandatoryLogic = 32;</code>
   */
  com.google.protobuf.ByteString
      getMandatoryLogicBytes();

  /**
   * <code>string callout = 33;</code>
   */
  java.lang.String getCallout();
  /**
   * <code>string callout = 33;</code>
   */
  com.google.protobuf.ByteString
      getCalloutBytes();

  /**
   * <code>string columnSQL = 34;</code>
   */
  java.lang.String getColumnSQL();
  /**
   * <code>string columnSQL = 34;</code>
   */
  com.google.protobuf.ByteString
      getColumnSQLBytes();

  /**
   * <code>string vFormat = 35;</code>
   */
  java.lang.String getVFormat();
  /**
   * <code>string vFormat = 35;</code>
   */
  com.google.protobuf.ByteString
      getVFormatBytes();

  /**
   * <code>string valueMin = 36;</code>
   */
  java.lang.String getValueMin();
  /**
   * <code>string valueMin = 36;</code>
   */
  com.google.protobuf.ByteString
      getValueMinBytes();

  /**
   * <code>string valueMax = 37;</code>
   */
  java.lang.String getValueMax();
  /**
   * <code>string valueMax = 37;</code>
   */
  com.google.protobuf.ByteString
      getValueMaxBytes();

  /**
   * <code>string formatPattern = 38;</code>
   */
  java.lang.String getFormatPattern();
  /**
   * <code>string formatPattern = 38;</code>
   */
  com.google.protobuf.ByteString
      getFormatPatternBytes();

  /**
   * <pre>
   * External Info
   * </pre>
   *
   * <code>.dictionary.ContextInfo contextInfo = 39;</code>
   */
  boolean hasContextInfo();
  /**
   * <pre>
   * External Info
   * </pre>
   *
   * <code>.dictionary.ContextInfo contextInfo = 39;</code>
   */
  org.spin.grpc.util.ContextInfo getContextInfo();
  /**
   * <pre>
   * External Info
   * </pre>
   *
   * <code>.dictionary.ContextInfo contextInfo = 39;</code>
   */
  org.spin.grpc.util.ContextInfoOrBuilder getContextInfoOrBuilder();

  /**
   * <code>.dictionary.FieldGroup fieldGroup = 40;</code>
   */
  boolean hasFieldGroup();
  /**
   * <code>.dictionary.FieldGroup fieldGroup = 40;</code>
   */
  org.spin.grpc.util.FieldGroup getFieldGroup();
  /**
   * <code>.dictionary.FieldGroup fieldGroup = 40;</code>
   */
  org.spin.grpc.util.FieldGroupOrBuilder getFieldGroupOrBuilder();

  /**
   * <code>.dictionary.Validation validation = 41;</code>
   */
  boolean hasValidation();
  /**
   * <code>.dictionary.Validation validation = 41;</code>
   */
  org.spin.grpc.util.Validation getValidation();
  /**
   * <code>.dictionary.Validation validation = 41;</code>
   */
  org.spin.grpc.util.ValidationOrBuilder getValidationOrBuilder();

  /**
   * <code>.dictionary.FieldDefinition fieldDefinition = 42;</code>
   */
  boolean hasFieldDefinition();
  /**
   * <code>.dictionary.FieldDefinition fieldDefinition = 42;</code>
   */
  org.spin.grpc.util.FieldDefinition getFieldDefinition();
  /**
   * <code>.dictionary.FieldDefinition fieldDefinition = 42;</code>
   */
  org.spin.grpc.util.FieldDefinitionOrBuilder getFieldDefinitionOrBuilder();

  /**
   * <code>.dictionary.Reference reference = 43;</code>
   */
  boolean hasReference();
  /**
   * <code>.dictionary.Reference reference = 43;</code>
   */
  org.spin.grpc.util.Reference getReference();
  /**
   * <code>.dictionary.Reference reference = 43;</code>
   */
  org.spin.grpc.util.ReferenceOrBuilder getReferenceOrBuilder();

  /**
   * <code>.dictionary.Process process = 44;</code>
   */
  boolean hasProcess();
  /**
   * <code>.dictionary.Process process = 44;</code>
   */
  org.spin.grpc.util.Process getProcess();
  /**
   * <code>.dictionary.Process process = 44;</code>
   */
  org.spin.grpc.util.ProcessOrBuilder getProcessOrBuilder();

  /**
   * <pre>
   * Smart Browser Field Compatibility
   * </pre>
   *
   * <code>bool isQueryCriteria = 45;</code>
   */
  boolean getIsQueryCriteria();

  /**
   * <code>bool isOrderBy = 46;</code>
   */
  boolean getIsOrderBy();

  /**
   * <code>int32 seqNoGrid = 47;</code>
   */
  int getSeqNoGrid();

  /**
   * <code>int32 sortNo = 48;</code>
   */
  int getSortNo();

  /**
   * <code>bool isInfoOnly = 49;</code>
   */
  boolean getIsInfoOnly();

  /**
   * <code>bool isActive = 50;</code>
   */
  boolean getIsActive();

  /**
   * <pre>
   * Process Parameter Compatibility
   * </pre>
   *
   * <code>string defaultValueTo = 51;</code>
   */
  java.lang.String getDefaultValueTo();
  /**
   * <pre>
   * Process Parameter Compatibility
   * </pre>
   *
   * <code>string defaultValueTo = 51;</code>
   */
  com.google.protobuf.ByteString
      getDefaultValueToBytes();
}
