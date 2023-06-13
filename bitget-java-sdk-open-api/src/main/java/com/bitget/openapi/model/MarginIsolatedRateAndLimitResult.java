/*
 * Bitget Open API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bitget.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitget.openapi.model.MarginIsolatedVipResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bitget.openapi.JSON;

/**
 * MarginIsolatedRateAndLimitResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarginIsolatedRateAndLimitResult {
  public static final String SERIALIZED_NAME_BASE_BORROW_ABLE = "baseBorrowAble";
  @SerializedName(SERIALIZED_NAME_BASE_BORROW_ABLE)
  private Boolean baseBorrowAble;

  public static final String SERIALIZED_NAME_BASE_COIN = "baseCoin";
  @SerializedName(SERIALIZED_NAME_BASE_COIN)
  private String baseCoin;

  public static final String SERIALIZED_NAME_BASE_DAILY_INTEREST_RATE = "baseDailyInterestRate";
  @SerializedName(SERIALIZED_NAME_BASE_DAILY_INTEREST_RATE)
  private String baseDailyInterestRate;

  public static final String SERIALIZED_NAME_BASE_MAX_BORROWABLE_AMOUNT = "baseMaxBorrowableAmount";
  @SerializedName(SERIALIZED_NAME_BASE_MAX_BORROWABLE_AMOUNT)
  private String baseMaxBorrowableAmount;

  public static final String SERIALIZED_NAME_BASE_TRANSFER_IN_ABLE = "baseTransferInAble";
  @SerializedName(SERIALIZED_NAME_BASE_TRANSFER_IN_ABLE)
  private Boolean baseTransferInAble;

  public static final String SERIALIZED_NAME_BASE_VIPS = "baseVips";
  @SerializedName(SERIALIZED_NAME_BASE_VIPS)
  private List<MarginIsolatedVipResult> baseVips = null;

  public static final String SERIALIZED_NAME_BASE_YEARLY_INTEREST_RATE = "baseYearlyInterestRate";
  @SerializedName(SERIALIZED_NAME_BASE_YEARLY_INTEREST_RATE)
  private String baseYearlyInterestRate;

  public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
  @SerializedName(SERIALIZED_NAME_LEVERAGE)
  private String leverage;

  public static final String SERIALIZED_NAME_QUOTE_BORROW_ABLE = "quoteBorrowAble";
  @SerializedName(SERIALIZED_NAME_QUOTE_BORROW_ABLE)
  private Boolean quoteBorrowAble;

  public static final String SERIALIZED_NAME_QUOTE_COIN = "quoteCoin";
  @SerializedName(SERIALIZED_NAME_QUOTE_COIN)
  private String quoteCoin;

  public static final String SERIALIZED_NAME_QUOTE_DAILY_INTEREST_RATE = "quoteDailyInterestRate";
  @SerializedName(SERIALIZED_NAME_QUOTE_DAILY_INTEREST_RATE)
  private String quoteDailyInterestRate;

  public static final String SERIALIZED_NAME_QUOTE_MAX_BORROWABLE_AMOUNT = "quoteMaxBorrowableAmount";
  @SerializedName(SERIALIZED_NAME_QUOTE_MAX_BORROWABLE_AMOUNT)
  private String quoteMaxBorrowableAmount;

  public static final String SERIALIZED_NAME_QUOTE_TRANSFER_IN_ABLE = "quoteTransferInAble";
  @SerializedName(SERIALIZED_NAME_QUOTE_TRANSFER_IN_ABLE)
  private Boolean quoteTransferInAble;

  public static final String SERIALIZED_NAME_QUOTE_VIPS = "quoteVips";
  @SerializedName(SERIALIZED_NAME_QUOTE_VIPS)
  private List<MarginIsolatedVipResult> quoteVips = null;

  public static final String SERIALIZED_NAME_QUOTE_YEARLY_INTEREST_RATE = "quoteYearlyInterestRate";
  @SerializedName(SERIALIZED_NAME_QUOTE_YEARLY_INTEREST_RATE)
  private String quoteYearlyInterestRate;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public MarginIsolatedRateAndLimitResult() {
  }

  public MarginIsolatedRateAndLimitResult baseBorrowAble(Boolean baseBorrowAble) {
    
    this.baseBorrowAble = baseBorrowAble;
    return this;
  }

   /**
   * Get baseBorrowAble
   * @return baseBorrowAble
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBaseBorrowAble() {
    return baseBorrowAble;
  }


  public void setBaseBorrowAble(Boolean baseBorrowAble) {
    this.baseBorrowAble = baseBorrowAble;
  }


  public MarginIsolatedRateAndLimitResult baseCoin(String baseCoin) {
    
    this.baseCoin = baseCoin;
    return this;
  }

   /**
   * Get baseCoin
   * @return baseCoin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseCoin() {
    return baseCoin;
  }


  public void setBaseCoin(String baseCoin) {
    this.baseCoin = baseCoin;
  }


  public MarginIsolatedRateAndLimitResult baseDailyInterestRate(String baseDailyInterestRate) {
    
    this.baseDailyInterestRate = baseDailyInterestRate;
    return this;
  }

   /**
   * Get baseDailyInterestRate
   * @return baseDailyInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseDailyInterestRate() {
    return baseDailyInterestRate;
  }


  public void setBaseDailyInterestRate(String baseDailyInterestRate) {
    this.baseDailyInterestRate = baseDailyInterestRate;
  }


  public MarginIsolatedRateAndLimitResult baseMaxBorrowableAmount(String baseMaxBorrowableAmount) {
    
    this.baseMaxBorrowableAmount = baseMaxBorrowableAmount;
    return this;
  }

   /**
   * Get baseMaxBorrowableAmount
   * @return baseMaxBorrowableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseMaxBorrowableAmount() {
    return baseMaxBorrowableAmount;
  }


  public void setBaseMaxBorrowableAmount(String baseMaxBorrowableAmount) {
    this.baseMaxBorrowableAmount = baseMaxBorrowableAmount;
  }


  public MarginIsolatedRateAndLimitResult baseTransferInAble(Boolean baseTransferInAble) {
    
    this.baseTransferInAble = baseTransferInAble;
    return this;
  }

   /**
   * Get baseTransferInAble
   * @return baseTransferInAble
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBaseTransferInAble() {
    return baseTransferInAble;
  }


  public void setBaseTransferInAble(Boolean baseTransferInAble) {
    this.baseTransferInAble = baseTransferInAble;
  }


  public MarginIsolatedRateAndLimitResult baseVips(List<MarginIsolatedVipResult> baseVips) {
    
    this.baseVips = baseVips;
    return this;
  }

  public MarginIsolatedRateAndLimitResult addBaseVipsItem(MarginIsolatedVipResult baseVipsItem) {
    if (this.baseVips == null) {
      this.baseVips = new ArrayList<>();
    }
    this.baseVips.add(baseVipsItem);
    return this;
  }

   /**
   * Get baseVips
   * @return baseVips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MarginIsolatedVipResult> getBaseVips() {
    return baseVips;
  }


  public void setBaseVips(List<MarginIsolatedVipResult> baseVips) {
    this.baseVips = baseVips;
  }


  public MarginIsolatedRateAndLimitResult baseYearlyInterestRate(String baseYearlyInterestRate) {
    
    this.baseYearlyInterestRate = baseYearlyInterestRate;
    return this;
  }

   /**
   * Get baseYearlyInterestRate
   * @return baseYearlyInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseYearlyInterestRate() {
    return baseYearlyInterestRate;
  }


  public void setBaseYearlyInterestRate(String baseYearlyInterestRate) {
    this.baseYearlyInterestRate = baseYearlyInterestRate;
  }


  public MarginIsolatedRateAndLimitResult leverage(String leverage) {
    
    this.leverage = leverage;
    return this;
  }

   /**
   * Get leverage
   * @return leverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLeverage() {
    return leverage;
  }


  public void setLeverage(String leverage) {
    this.leverage = leverage;
  }


  public MarginIsolatedRateAndLimitResult quoteBorrowAble(Boolean quoteBorrowAble) {
    
    this.quoteBorrowAble = quoteBorrowAble;
    return this;
  }

   /**
   * Get quoteBorrowAble
   * @return quoteBorrowAble
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getQuoteBorrowAble() {
    return quoteBorrowAble;
  }


  public void setQuoteBorrowAble(Boolean quoteBorrowAble) {
    this.quoteBorrowAble = quoteBorrowAble;
  }


  public MarginIsolatedRateAndLimitResult quoteCoin(String quoteCoin) {
    
    this.quoteCoin = quoteCoin;
    return this;
  }

   /**
   * Get quoteCoin
   * @return quoteCoin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuoteCoin() {
    return quoteCoin;
  }


  public void setQuoteCoin(String quoteCoin) {
    this.quoteCoin = quoteCoin;
  }


  public MarginIsolatedRateAndLimitResult quoteDailyInterestRate(String quoteDailyInterestRate) {
    
    this.quoteDailyInterestRate = quoteDailyInterestRate;
    return this;
  }

   /**
   * Get quoteDailyInterestRate
   * @return quoteDailyInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuoteDailyInterestRate() {
    return quoteDailyInterestRate;
  }


  public void setQuoteDailyInterestRate(String quoteDailyInterestRate) {
    this.quoteDailyInterestRate = quoteDailyInterestRate;
  }


  public MarginIsolatedRateAndLimitResult quoteMaxBorrowableAmount(String quoteMaxBorrowableAmount) {
    
    this.quoteMaxBorrowableAmount = quoteMaxBorrowableAmount;
    return this;
  }

   /**
   * Get quoteMaxBorrowableAmount
   * @return quoteMaxBorrowableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuoteMaxBorrowableAmount() {
    return quoteMaxBorrowableAmount;
  }


  public void setQuoteMaxBorrowableAmount(String quoteMaxBorrowableAmount) {
    this.quoteMaxBorrowableAmount = quoteMaxBorrowableAmount;
  }


  public MarginIsolatedRateAndLimitResult quoteTransferInAble(Boolean quoteTransferInAble) {
    
    this.quoteTransferInAble = quoteTransferInAble;
    return this;
  }

   /**
   * Get quoteTransferInAble
   * @return quoteTransferInAble
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getQuoteTransferInAble() {
    return quoteTransferInAble;
  }


  public void setQuoteTransferInAble(Boolean quoteTransferInAble) {
    this.quoteTransferInAble = quoteTransferInAble;
  }


  public MarginIsolatedRateAndLimitResult quoteVips(List<MarginIsolatedVipResult> quoteVips) {
    
    this.quoteVips = quoteVips;
    return this;
  }

  public MarginIsolatedRateAndLimitResult addQuoteVipsItem(MarginIsolatedVipResult quoteVipsItem) {
    if (this.quoteVips == null) {
      this.quoteVips = new ArrayList<>();
    }
    this.quoteVips.add(quoteVipsItem);
    return this;
  }

   /**
   * Get quoteVips
   * @return quoteVips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MarginIsolatedVipResult> getQuoteVips() {
    return quoteVips;
  }


  public void setQuoteVips(List<MarginIsolatedVipResult> quoteVips) {
    this.quoteVips = quoteVips;
  }


  public MarginIsolatedRateAndLimitResult quoteYearlyInterestRate(String quoteYearlyInterestRate) {
    
    this.quoteYearlyInterestRate = quoteYearlyInterestRate;
    return this;
  }

   /**
   * Get quoteYearlyInterestRate
   * @return quoteYearlyInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuoteYearlyInterestRate() {
    return quoteYearlyInterestRate;
  }


  public void setQuoteYearlyInterestRate(String quoteYearlyInterestRate) {
    this.quoteYearlyInterestRate = quoteYearlyInterestRate;
  }


  public MarginIsolatedRateAndLimitResult symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the MarginIsolatedRateAndLimitResult instance itself
   */
  public MarginIsolatedRateAndLimitResult putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginIsolatedRateAndLimitResult marginIsolatedRateAndLimitResult = (MarginIsolatedRateAndLimitResult) o;
    return Objects.equals(this.baseBorrowAble, marginIsolatedRateAndLimitResult.baseBorrowAble) &&
        Objects.equals(this.baseCoin, marginIsolatedRateAndLimitResult.baseCoin) &&
        Objects.equals(this.baseDailyInterestRate, marginIsolatedRateAndLimitResult.baseDailyInterestRate) &&
        Objects.equals(this.baseMaxBorrowableAmount, marginIsolatedRateAndLimitResult.baseMaxBorrowableAmount) &&
        Objects.equals(this.baseTransferInAble, marginIsolatedRateAndLimitResult.baseTransferInAble) &&
        Objects.equals(this.baseVips, marginIsolatedRateAndLimitResult.baseVips) &&
        Objects.equals(this.baseYearlyInterestRate, marginIsolatedRateAndLimitResult.baseYearlyInterestRate) &&
        Objects.equals(this.leverage, marginIsolatedRateAndLimitResult.leverage) &&
        Objects.equals(this.quoteBorrowAble, marginIsolatedRateAndLimitResult.quoteBorrowAble) &&
        Objects.equals(this.quoteCoin, marginIsolatedRateAndLimitResult.quoteCoin) &&
        Objects.equals(this.quoteDailyInterestRate, marginIsolatedRateAndLimitResult.quoteDailyInterestRate) &&
        Objects.equals(this.quoteMaxBorrowableAmount, marginIsolatedRateAndLimitResult.quoteMaxBorrowableAmount) &&
        Objects.equals(this.quoteTransferInAble, marginIsolatedRateAndLimitResult.quoteTransferInAble) &&
        Objects.equals(this.quoteVips, marginIsolatedRateAndLimitResult.quoteVips) &&
        Objects.equals(this.quoteYearlyInterestRate, marginIsolatedRateAndLimitResult.quoteYearlyInterestRate) &&
        Objects.equals(this.symbol, marginIsolatedRateAndLimitResult.symbol)&&
        Objects.equals(this.additionalProperties, marginIsolatedRateAndLimitResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseBorrowAble, baseCoin, baseDailyInterestRate, baseMaxBorrowableAmount, baseTransferInAble, baseVips, baseYearlyInterestRate, leverage, quoteBorrowAble, quoteCoin, quoteDailyInterestRate, quoteMaxBorrowableAmount, quoteTransferInAble, quoteVips, quoteYearlyInterestRate, symbol, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginIsolatedRateAndLimitResult {\n");
    sb.append("    baseBorrowAble: ").append(toIndentedString(baseBorrowAble)).append("\n");
    sb.append("    baseCoin: ").append(toIndentedString(baseCoin)).append("\n");
    sb.append("    baseDailyInterestRate: ").append(toIndentedString(baseDailyInterestRate)).append("\n");
    sb.append("    baseMaxBorrowableAmount: ").append(toIndentedString(baseMaxBorrowableAmount)).append("\n");
    sb.append("    baseTransferInAble: ").append(toIndentedString(baseTransferInAble)).append("\n");
    sb.append("    baseVips: ").append(toIndentedString(baseVips)).append("\n");
    sb.append("    baseYearlyInterestRate: ").append(toIndentedString(baseYearlyInterestRate)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    quoteBorrowAble: ").append(toIndentedString(quoteBorrowAble)).append("\n");
    sb.append("    quoteCoin: ").append(toIndentedString(quoteCoin)).append("\n");
    sb.append("    quoteDailyInterestRate: ").append(toIndentedString(quoteDailyInterestRate)).append("\n");
    sb.append("    quoteMaxBorrowableAmount: ").append(toIndentedString(quoteMaxBorrowableAmount)).append("\n");
    sb.append("    quoteTransferInAble: ").append(toIndentedString(quoteTransferInAble)).append("\n");
    sb.append("    quoteVips: ").append(toIndentedString(quoteVips)).append("\n");
    sb.append("    quoteYearlyInterestRate: ").append(toIndentedString(quoteYearlyInterestRate)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("baseBorrowAble");
    openapiFields.add("baseCoin");
    openapiFields.add("baseDailyInterestRate");
    openapiFields.add("baseMaxBorrowableAmount");
    openapiFields.add("baseTransferInAble");
    openapiFields.add("baseVips");
    openapiFields.add("baseYearlyInterestRate");
    openapiFields.add("leverage");
    openapiFields.add("quoteBorrowAble");
    openapiFields.add("quoteCoin");
    openapiFields.add("quoteDailyInterestRate");
    openapiFields.add("quoteMaxBorrowableAmount");
    openapiFields.add("quoteTransferInAble");
    openapiFields.add("quoteVips");
    openapiFields.add("quoteYearlyInterestRate");
    openapiFields.add("symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MarginIsolatedRateAndLimitResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MarginIsolatedRateAndLimitResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarginIsolatedRateAndLimitResult is not found in the empty JSON string", MarginIsolatedRateAndLimitResult.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("baseCoin") != null && !jsonObj.get("baseCoin").isJsonNull()) && !jsonObj.get("baseCoin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseCoin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseCoin").toString()));
      }
      if ((jsonObj.get("baseDailyInterestRate") != null && !jsonObj.get("baseDailyInterestRate").isJsonNull()) && !jsonObj.get("baseDailyInterestRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseDailyInterestRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseDailyInterestRate").toString()));
      }
      if ((jsonObj.get("baseMaxBorrowableAmount") != null && !jsonObj.get("baseMaxBorrowableAmount").isJsonNull()) && !jsonObj.get("baseMaxBorrowableAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseMaxBorrowableAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseMaxBorrowableAmount").toString()));
      }
      if (jsonObj.get("baseVips") != null && !jsonObj.get("baseVips").isJsonNull()) {
        JsonArray jsonArraybaseVips = jsonObj.getAsJsonArray("baseVips");
        if (jsonArraybaseVips != null) {
          // ensure the json data is an array
          if (!jsonObj.get("baseVips").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `baseVips` to be an array in the JSON string but got `%s`", jsonObj.get("baseVips").toString()));
          }

          // validate the optional field `baseVips` (array)
          for (int i = 0; i < jsonArraybaseVips.size(); i++) {
            MarginIsolatedVipResult.validateJsonObject(jsonArraybaseVips.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("baseYearlyInterestRate") != null && !jsonObj.get("baseYearlyInterestRate").isJsonNull()) && !jsonObj.get("baseYearlyInterestRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseYearlyInterestRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseYearlyInterestRate").toString()));
      }
      if ((jsonObj.get("leverage") != null && !jsonObj.get("leverage").isJsonNull()) && !jsonObj.get("leverage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leverage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leverage").toString()));
      }
      if ((jsonObj.get("quoteCoin") != null && !jsonObj.get("quoteCoin").isJsonNull()) && !jsonObj.get("quoteCoin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteCoin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteCoin").toString()));
      }
      if ((jsonObj.get("quoteDailyInterestRate") != null && !jsonObj.get("quoteDailyInterestRate").isJsonNull()) && !jsonObj.get("quoteDailyInterestRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteDailyInterestRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteDailyInterestRate").toString()));
      }
      if ((jsonObj.get("quoteMaxBorrowableAmount") != null && !jsonObj.get("quoteMaxBorrowableAmount").isJsonNull()) && !jsonObj.get("quoteMaxBorrowableAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteMaxBorrowableAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteMaxBorrowableAmount").toString()));
      }
      if (jsonObj.get("quoteVips") != null && !jsonObj.get("quoteVips").isJsonNull()) {
        JsonArray jsonArrayquoteVips = jsonObj.getAsJsonArray("quoteVips");
        if (jsonArrayquoteVips != null) {
          // ensure the json data is an array
          if (!jsonObj.get("quoteVips").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `quoteVips` to be an array in the JSON string but got `%s`", jsonObj.get("quoteVips").toString()));
          }

          // validate the optional field `quoteVips` (array)
          for (int i = 0; i < jsonArrayquoteVips.size(); i++) {
            MarginIsolatedVipResult.validateJsonObject(jsonArrayquoteVips.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("quoteYearlyInterestRate") != null && !jsonObj.get("quoteYearlyInterestRate").isJsonNull()) && !jsonObj.get("quoteYearlyInterestRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteYearlyInterestRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteYearlyInterestRate").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarginIsolatedRateAndLimitResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarginIsolatedRateAndLimitResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarginIsolatedRateAndLimitResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarginIsolatedRateAndLimitResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MarginIsolatedRateAndLimitResult>() {
           @Override
           public void write(JsonWriter out, MarginIsolatedRateAndLimitResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public MarginIsolatedRateAndLimitResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MarginIsolatedRateAndLimitResult instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarginIsolatedRateAndLimitResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarginIsolatedRateAndLimitResult
  * @throws IOException if the JSON string is invalid with respect to MarginIsolatedRateAndLimitResult
  */
  public static MarginIsolatedRateAndLimitResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarginIsolatedRateAndLimitResult.class);
  }

 /**
  * Convert an instance of MarginIsolatedRateAndLimitResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
