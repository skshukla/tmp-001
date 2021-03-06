/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.github.tillias.spbka.schema.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Avro Schema for Event */
@org.apache.avro.specific.AvroGenerated
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -436422388971261267L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"com.github.tillias.spbka.schema.avro\",\"doc\":\"Avro Schema for Event\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":\"string\"},{\"name\":\"createdOn\",\"type\":\"int\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"f1\",\"type\":\"int\"},{\"name\":\"f2\",\"type\":\"int\"},{\"name\":\"f3\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Event> ENCODER =
      new BinaryMessageEncoder<Event>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Event> DECODER =
      new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Event> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Event> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Event> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Event to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Event from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Event instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Event fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence name;
   private java.lang.CharSequence description;
   private int createdOn;
   private int f1;
   private int f2;
   private int f3;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Event() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param description The new value for description
   * @param createdOn The new value for createdOn
   * @param f1 The new value for f1
   * @param f2 The new value for f2
   * @param f3 The new value for f3
   */
  public Event(java.lang.CharSequence name, java.lang.CharSequence description, java.lang.Integer createdOn, java.lang.Integer f1, java.lang.Integer f2, java.lang.Integer f3) {
    this.name = name;
    this.description = description;
    this.createdOn = createdOn;
    this.f1 = f1;
    this.f2 = f2;
    this.f3 = f3;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return description;
    case 2: return createdOn;
    case 3: return f1;
    case 4: return f2;
    case 5: return f3;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: description = (java.lang.CharSequence)value$; break;
    case 2: createdOn = (java.lang.Integer)value$; break;
    case 3: f1 = (java.lang.Integer)value$; break;
    case 4: f2 = (java.lang.Integer)value$; break;
    case 5: f3 = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'createdOn' field.
   * @return The value of the 'createdOn' field.
   */
  public int getCreatedOn() {
    return createdOn;
  }


  /**
   * Sets the value of the 'createdOn' field.
   * @param value the value to set.
   */
  public void setCreatedOn(int value) {
    this.createdOn = value;
  }

  /**
   * Gets the value of the 'f1' field.
   * @return The value of the 'f1' field.
   */
  public int getF1() {
    return f1;
  }


  /**
   * Sets the value of the 'f1' field.
   * @param value the value to set.
   */
  public void setF1(int value) {
    this.f1 = value;
  }

  /**
   * Gets the value of the 'f2' field.
   * @return The value of the 'f2' field.
   */
  public int getF2() {
    return f2;
  }


  /**
   * Sets the value of the 'f2' field.
   * @param value the value to set.
   */
  public void setF2(int value) {
    this.f2 = value;
  }

  /**
   * Gets the value of the 'f3' field.
   * @return The value of the 'f3' field.
   */
  public int getF3() {
    return f3;
  }


  /**
   * Sets the value of the 'f3' field.
   * @param value the value to set.
   */
  public void setF3(int value) {
    this.f3 = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static com.github.tillias.spbka.schema.avro.Event.Builder newBuilder() {
    return new com.github.tillias.spbka.schema.avro.Event.Builder();
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static com.github.tillias.spbka.schema.avro.Event.Builder newBuilder(com.github.tillias.spbka.schema.avro.Event.Builder other) {
    if (other == null) {
      return new com.github.tillias.spbka.schema.avro.Event.Builder();
    } else {
      return new com.github.tillias.spbka.schema.avro.Event.Builder(other);
    }
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static com.github.tillias.spbka.schema.avro.Event.Builder newBuilder(com.github.tillias.spbka.schema.avro.Event other) {
    if (other == null) {
      return new com.github.tillias.spbka.schema.avro.Event.Builder();
    } else {
      return new com.github.tillias.spbka.schema.avro.Event.Builder(other);
    }
  }

  /**
   * RecordBuilder for Event instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence description;
    private int createdOn;
    private int f1;
    private int f2;
    private int f3;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.github.tillias.spbka.schema.avro.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.createdOn)) {
        this.createdOn = data().deepCopy(fields()[2].schema(), other.createdOn);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.f1)) {
        this.f1 = data().deepCopy(fields()[3].schema(), other.f1);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.f2)) {
        this.f2 = data().deepCopy(fields()[4].schema(), other.f2);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.f3)) {
        this.f3 = data().deepCopy(fields()[5].schema(), other.f3);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(com.github.tillias.spbka.schema.avro.Event other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.createdOn)) {
        this.createdOn = data().deepCopy(fields()[2].schema(), other.createdOn);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.f1)) {
        this.f1 = data().deepCopy(fields()[3].schema(), other.f1);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.f2)) {
        this.f2 = data().deepCopy(fields()[4].schema(), other.f2);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.f3)) {
        this.f3 = data().deepCopy(fields()[5].schema(), other.f3);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.description = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdOn' field.
      * @return The value.
      */
    public int getCreatedOn() {
      return createdOn;
    }


    /**
      * Sets the value of the 'createdOn' field.
      * @param value The value of 'createdOn'.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder setCreatedOn(int value) {
      validate(fields()[2], value);
      this.createdOn = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'createdOn' field has been set.
      * @return True if the 'createdOn' field has been set, false otherwise.
      */
    public boolean hasCreatedOn() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'createdOn' field.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder clearCreatedOn() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'f1' field.
      * @return The value.
      */
    public int getF1() {
      return f1;
    }


    /**
      * Sets the value of the 'f1' field.
      * @param value The value of 'f1'.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder setF1(int value) {
      validate(fields()[3], value);
      this.f1 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'f1' field has been set.
      * @return True if the 'f1' field has been set, false otherwise.
      */
    public boolean hasF1() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'f1' field.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder clearF1() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'f2' field.
      * @return The value.
      */
    public int getF2() {
      return f2;
    }


    /**
      * Sets the value of the 'f2' field.
      * @param value The value of 'f2'.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder setF2(int value) {
      validate(fields()[4], value);
      this.f2 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'f2' field has been set.
      * @return True if the 'f2' field has been set, false otherwise.
      */
    public boolean hasF2() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'f2' field.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder clearF2() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'f3' field.
      * @return The value.
      */
    public int getF3() {
      return f3;
    }


    /**
      * Sets the value of the 'f3' field.
      * @param value The value of 'f3'.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder setF3(int value) {
      validate(fields()[5], value);
      this.f3 = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'f3' field has been set.
      * @return True if the 'f3' field has been set, false otherwise.
      */
    public boolean hasF3() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'f3' field.
      * @return This builder.
      */
    public com.github.tillias.spbka.schema.avro.Event.Builder clearF3() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Event build() {
      try {
        Event record = new Event();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.createdOn = fieldSetFlags()[2] ? this.createdOn : (java.lang.Integer) defaultValue(fields()[2]);
        record.f1 = fieldSetFlags()[3] ? this.f1 : (java.lang.Integer) defaultValue(fields()[3]);
        record.f2 = fieldSetFlags()[4] ? this.f2 : (java.lang.Integer) defaultValue(fields()[4]);
        record.f3 = fieldSetFlags()[5] ? this.f3 : (java.lang.Integer) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Event>
    WRITER$ = (org.apache.avro.io.DatumWriter<Event>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Event>
    READER$ = (org.apache.avro.io.DatumReader<Event>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeString(this.description);

    out.writeInt(this.createdOn);

    out.writeInt(this.f1);

    out.writeInt(this.f2);

    out.writeInt(this.f3);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.description = in.readString(this.description instanceof Utf8 ? (Utf8)this.description : null);

      this.createdOn = in.readInt();

      this.f1 = in.readInt();

      this.f2 = in.readInt();

      this.f3 = in.readInt();

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          this.description = in.readString(this.description instanceof Utf8 ? (Utf8)this.description : null);
          break;

        case 2:
          this.createdOn = in.readInt();
          break;

        case 3:
          this.f1 = in.readInt();
          break;

        case 4:
          this.f2 = in.readInt();
          break;

        case 5:
          this.f3 = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










