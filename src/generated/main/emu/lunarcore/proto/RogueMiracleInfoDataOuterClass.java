// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class RogueMiracleInfoDataOuterClass {
  /**
   * Protobuf type {@code RogueMiracleInfoData}
   */
  public static final class RogueMiracleInfoData extends ProtoMessage<RogueMiracleInfoData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 EGCFBOPLHKJ = 4;</code>
     */
    private int eGCFBOPLHKJ;

    /**
     * <code>optional uint32 JPDGMALBBAB = 7;</code>
     */
    private int jPDGMALBBAB;

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_data_info = 1;</code>
     */
    private final RepeatedMessage<RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo> rogueMiracleDataInfo = RepeatedMessage.newEmptyInstance(RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo.getFactory());

    private RogueMiracleInfoData() {
    }

    /**
     * @return a new empty instance of {@code RogueMiracleInfoData}
     */
    public static RogueMiracleInfoData newInstance() {
      return new RogueMiracleInfoData();
    }

    /**
     * <code>optional uint32 EGCFBOPLHKJ = 4;</code>
     * @return whether the eGCFBOPLHKJ field is set
     */
    public boolean hasEGCFBOPLHKJ() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 EGCFBOPLHKJ = 4;</code>
     * @return this
     */
    public RogueMiracleInfoData clearEGCFBOPLHKJ() {
      bitField0_ &= ~0x00000001;
      eGCFBOPLHKJ = 0;
      return this;
    }

    /**
     * <code>optional uint32 EGCFBOPLHKJ = 4;</code>
     * @return the eGCFBOPLHKJ
     */
    public int getEGCFBOPLHKJ() {
      return eGCFBOPLHKJ;
    }

    /**
     * <code>optional uint32 EGCFBOPLHKJ = 4;</code>
     * @param value the eGCFBOPLHKJ to set
     * @return this
     */
    public RogueMiracleInfoData setEGCFBOPLHKJ(final int value) {
      bitField0_ |= 0x00000001;
      eGCFBOPLHKJ = value;
      return this;
    }

    /**
     * <code>optional uint32 JPDGMALBBAB = 7;</code>
     * @return whether the jPDGMALBBAB field is set
     */
    public boolean hasJPDGMALBBAB() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 JPDGMALBBAB = 7;</code>
     * @return this
     */
    public RogueMiracleInfoData clearJPDGMALBBAB() {
      bitField0_ &= ~0x00000002;
      jPDGMALBBAB = 0;
      return this;
    }

    /**
     * <code>optional uint32 JPDGMALBBAB = 7;</code>
     * @return the jPDGMALBBAB
     */
    public int getJPDGMALBBAB() {
      return jPDGMALBBAB;
    }

    /**
     * <code>optional uint32 JPDGMALBBAB = 7;</code>
     * @param value the jPDGMALBBAB to set
     * @return this
     */
    public RogueMiracleInfoData setJPDGMALBBAB(final int value) {
      bitField0_ |= 0x00000002;
      jPDGMALBBAB = value;
      return this;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_data_info = 1;</code>
     * @return whether the rogueMiracleDataInfo field is set
     */
    public boolean hasRogueMiracleDataInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_data_info = 1;</code>
     * @return this
     */
    public RogueMiracleInfoData clearRogueMiracleDataInfo() {
      bitField0_ &= ~0x00000004;
      rogueMiracleDataInfo.clear();
      return this;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_data_info = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueMiracleDataInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo> getRogueMiracleDataInfo(
        ) {
      return rogueMiracleDataInfo;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_data_info = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo> getMutableRogueMiracleDataInfo(
        ) {
      bitField0_ |= 0x00000004;
      return rogueMiracleDataInfo;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_data_info = 1;</code>
     * @param value the rogueMiracleDataInfo to add
     * @return this
     */
    public RogueMiracleInfoData addRogueMiracleDataInfo(
        final RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo value) {
      bitField0_ |= 0x00000004;
      rogueMiracleDataInfo.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueMiracleDataInfo rogue_miracle_data_info = 1;</code>
     * @param values the rogueMiracleDataInfo to add
     * @return this
     */
    public RogueMiracleInfoData addAllRogueMiracleDataInfo(
        final RogueMiracleDataInfoOuterClass.RogueMiracleDataInfo... values) {
      bitField0_ |= 0x00000004;
      rogueMiracleDataInfo.addAll(values);
      return this;
    }

    @Override
    public RogueMiracleInfoData copyFrom(final RogueMiracleInfoData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        eGCFBOPLHKJ = other.eGCFBOPLHKJ;
        jPDGMALBBAB = other.jPDGMALBBAB;
        rogueMiracleDataInfo.copyFrom(other.rogueMiracleDataInfo);
      }
      return this;
    }

    @Override
    public RogueMiracleInfoData mergeFrom(final RogueMiracleInfoData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEGCFBOPLHKJ()) {
        setEGCFBOPLHKJ(other.eGCFBOPLHKJ);
      }
      if (other.hasJPDGMALBBAB()) {
        setJPDGMALBBAB(other.jPDGMALBBAB);
      }
      if (other.hasRogueMiracleDataInfo()) {
        getMutableRogueMiracleDataInfo().addAll(other.rogueMiracleDataInfo);
      }
      return this;
    }

    @Override
    public RogueMiracleInfoData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      eGCFBOPLHKJ = 0;
      jPDGMALBBAB = 0;
      rogueMiracleDataInfo.clear();
      return this;
    }

    @Override
    public RogueMiracleInfoData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueMiracleDataInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueMiracleInfoData)) {
        return false;
      }
      RogueMiracleInfoData other = (RogueMiracleInfoData) o;
      return bitField0_ == other.bitField0_
        && (!hasEGCFBOPLHKJ() || eGCFBOPLHKJ == other.eGCFBOPLHKJ)
        && (!hasJPDGMALBBAB() || jPDGMALBBAB == other.jPDGMALBBAB)
        && (!hasRogueMiracleDataInfo() || rogueMiracleDataInfo.equals(other.rogueMiracleDataInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(eGCFBOPLHKJ);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(jPDGMALBBAB);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < rogueMiracleDataInfo.length(); i++) {
          output.writeRawByte((byte) 10);
          output.writeMessageNoTag(rogueMiracleDataInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eGCFBOPLHKJ);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(jPDGMALBBAB);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * rogueMiracleDataInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(rogueMiracleDataInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueMiracleInfoData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // eGCFBOPLHKJ
            eGCFBOPLHKJ = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // jPDGMALBBAB
            jPDGMALBBAB = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // rogueMiracleDataInfo
            tag = input.readRepeatedMessage(rogueMiracleDataInfo, tag);
            bitField0_ |= 0x00000004;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.eGCFBOPLHKJ, eGCFBOPLHKJ);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.jPDGMALBBAB, jPDGMALBBAB);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.rogueMiracleDataInfo, rogueMiracleDataInfo);
      }
      output.endObject();
    }

    @Override
    public RogueMiracleInfoData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1177746393: {
            if (input.isAtField(FieldNames.eGCFBOPLHKJ)) {
              if (!input.trySkipNullValue()) {
                eGCFBOPLHKJ = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -282541776: {
            if (input.isAtField(FieldNames.jPDGMALBBAB)) {
              if (!input.trySkipNullValue()) {
                jPDGMALBBAB = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1571359281:
          case -1539255632: {
            if (input.isAtField(FieldNames.rogueMiracleDataInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(rogueMiracleDataInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RogueMiracleInfoData clone() {
      return new RogueMiracleInfoData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueMiracleInfoData parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueMiracleInfoData(), data).checkInitialized();
    }

    public static RogueMiracleInfoData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueMiracleInfoData(), input).checkInitialized();
    }

    public static RogueMiracleInfoData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueMiracleInfoData(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueMiracleInfoData messages
     */
    public static MessageFactory<RogueMiracleInfoData> getFactory() {
      return RogueMiracleInfoDataFactory.INSTANCE;
    }

    private enum RogueMiracleInfoDataFactory implements MessageFactory<RogueMiracleInfoData> {
      INSTANCE;

      @Override
      public RogueMiracleInfoData create() {
        return RogueMiracleInfoData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName eGCFBOPLHKJ = FieldName.forField("EGCFBOPLHKJ");

      static final FieldName jPDGMALBBAB = FieldName.forField("JPDGMALBBAB");

      static final FieldName rogueMiracleDataInfo = FieldName.forField("rogueMiracleDataInfo", "rogue_miracle_data_info");
    }
  }
}