/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ambiata.ivory.core.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ThriftDictionaryType implements org.apache.thrift.TEnum {
  NUMERICAL(0),
  CONTINOUS(1),
  CATEGORICAL(2),
  BINARY(3);

  private final int value;

  private ThriftDictionaryType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftDictionaryType findByValue(int value) { 
    switch (value) {
      case 0:
        return NUMERICAL;
      case 1:
        return CONTINOUS;
      case 2:
        return CATEGORICAL;
      case 3:
        return BINARY;
      default:
        return null;
    }
  }
}
