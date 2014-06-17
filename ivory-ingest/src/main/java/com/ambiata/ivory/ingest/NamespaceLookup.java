/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ambiata.ivory.ingest;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NamespaceLookup implements org.apache.thrift.TBase<NamespaceLookup, NamespaceLookup._Fields>, java.io.Serializable, Cloneable, Comparable<NamespaceLookup> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NamespaceLookup");

  private static final org.apache.thrift.protocol.TField NAMESPACES_FIELD_DESC = new org.apache.thrift.protocol.TField("namespaces", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NamespaceLookupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NamespaceLookupTupleSchemeFactory());
  }

  public Map<Integer,String> namespaces; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAMESPACES((short)1, "namespaces");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAMESPACES
          return NAMESPACES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAMESPACES, new org.apache.thrift.meta_data.FieldMetaData("namespaces", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NamespaceLookup.class, metaDataMap);
  }

  public NamespaceLookup() {
  }

  public NamespaceLookup(
    Map<Integer,String> namespaces)
  {
    this();
    this.namespaces = namespaces;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NamespaceLookup(NamespaceLookup other) {
    if (other.isSetNamespaces()) {
      Map<Integer,String> __this__namespaces = new HashMap<Integer,String>(other.namespaces);
      this.namespaces = __this__namespaces;
    }
  }

  public NamespaceLookup deepCopy() {
    return new NamespaceLookup(this);
  }

  @Override
  public void clear() {
    this.namespaces = null;
  }

  public int getNamespacesSize() {
    return (this.namespaces == null) ? 0 : this.namespaces.size();
  }

  public void putToNamespaces(int key, String val) {
    if (this.namespaces == null) {
      this.namespaces = new HashMap<Integer,String>();
    }
    this.namespaces.put(key, val);
  }

  public Map<Integer,String> getNamespaces() {
    return this.namespaces;
  }

  public NamespaceLookup setNamespaces(Map<Integer,String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public void unsetNamespaces() {
    this.namespaces = null;
  }

  /** Returns true if field namespaces is set (has been assigned a value) and false otherwise */
  public boolean isSetNamespaces() {
    return this.namespaces != null;
  }

  public void setNamespacesIsSet(boolean value) {
    if (!value) {
      this.namespaces = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAMESPACES:
      if (value == null) {
        unsetNamespaces();
      } else {
        setNamespaces((Map<Integer,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAMESPACES:
      return getNamespaces();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAMESPACES:
      return isSetNamespaces();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NamespaceLookup)
      return this.equals((NamespaceLookup)that);
    return false;
  }

  public boolean equals(NamespaceLookup that) {
    if (that == null)
      return false;

    boolean this_present_namespaces = true && this.isSetNamespaces();
    boolean that_present_namespaces = true && that.isSetNamespaces();
    if (this_present_namespaces || that_present_namespaces) {
      if (!(this_present_namespaces && that_present_namespaces))
        return false;
      if (!this.namespaces.equals(that.namespaces))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(NamespaceLookup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNamespaces()).compareTo(other.isSetNamespaces());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNamespaces()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.namespaces, other.namespaces);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("NamespaceLookup(");
    boolean first = true;

    sb.append("namespaces:");
    if (this.namespaces == null) {
      sb.append("null");
    } else {
      sb.append(this.namespaces);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NamespaceLookupStandardSchemeFactory implements SchemeFactory {
    public NamespaceLookupStandardScheme getScheme() {
      return new NamespaceLookupStandardScheme();
    }
  }

  private static class NamespaceLookupStandardScheme extends StandardScheme<NamespaceLookup> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NamespaceLookup struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAMESPACES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.namespaces = new HashMap<Integer,String>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  int _key2;
                  String _val3;
                  _key2 = iprot.readI32();
                  _val3 = iprot.readString();
                  struct.namespaces.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setNamespacesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NamespaceLookup struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.namespaces != null) {
        oprot.writeFieldBegin(NAMESPACES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, struct.namespaces.size()));
          for (Map.Entry<Integer, String> _iter4 : struct.namespaces.entrySet())
          {
            oprot.writeI32(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NamespaceLookupTupleSchemeFactory implements SchemeFactory {
    public NamespaceLookupTupleScheme getScheme() {
      return new NamespaceLookupTupleScheme();
    }
  }

  private static class NamespaceLookupTupleScheme extends TupleScheme<NamespaceLookup> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NamespaceLookup struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNamespaces()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNamespaces()) {
        {
          oprot.writeI32(struct.namespaces.size());
          for (Map.Entry<Integer, String> _iter5 : struct.namespaces.entrySet())
          {
            oprot.writeI32(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NamespaceLookup struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.namespaces = new HashMap<Integer,String>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            int _key8;
            String _val9;
            _key8 = iprot.readI32();
            _val9 = iprot.readString();
            struct.namespaces.put(_key8, _val9);
          }
        }
        struct.setNamespacesIsSet(true);
      }
    }
  }

}
