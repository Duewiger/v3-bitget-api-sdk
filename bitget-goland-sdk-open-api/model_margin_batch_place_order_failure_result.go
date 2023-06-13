/*
Bitget Open API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 2.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// MarginBatchPlaceOrderFailureResult struct for MarginBatchPlaceOrderFailureResult
type MarginBatchPlaceOrderFailureResult struct {
	ClientOid            *string `json:"clientOid,omitempty"`
	ErrorMsg             *string `json:"errorMsg,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _MarginBatchPlaceOrderFailureResult MarginBatchPlaceOrderFailureResult

// NewMarginBatchPlaceOrderFailureResult instantiates a new MarginBatchPlaceOrderFailureResult object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMarginBatchPlaceOrderFailureResult() *MarginBatchPlaceOrderFailureResult {
	this := MarginBatchPlaceOrderFailureResult{}
	return &this
}

// NewMarginBatchPlaceOrderFailureResultWithDefaults instantiates a new MarginBatchPlaceOrderFailureResult object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMarginBatchPlaceOrderFailureResultWithDefaults() *MarginBatchPlaceOrderFailureResult {
	this := MarginBatchPlaceOrderFailureResult{}
	return &this
}

// GetClientOid returns the ClientOid field value if set, zero value otherwise.
func (o *MarginBatchPlaceOrderFailureResult) GetClientOid() string {
	if o == nil || isNil(o.ClientOid) {
		var ret string
		return ret
	}
	return *o.ClientOid
}

// GetClientOidOk returns a tuple with the ClientOid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MarginBatchPlaceOrderFailureResult) GetClientOidOk() (*string, bool) {
	if o == nil || isNil(o.ClientOid) {
		return nil, false
	}
	return o.ClientOid, true
}

// HasClientOid returns a boolean if a field has been set.
func (o *MarginBatchPlaceOrderFailureResult) HasClientOid() bool {
	if o != nil && !isNil(o.ClientOid) {
		return true
	}

	return false
}

// SetClientOid gets a reference to the given string and assigns it to the ClientOid field.
func (o *MarginBatchPlaceOrderFailureResult) SetClientOid(v string) {
	o.ClientOid = &v
}

// GetErrorMsg returns the ErrorMsg field value if set, zero value otherwise.
func (o *MarginBatchPlaceOrderFailureResult) GetErrorMsg() string {
	if o == nil || isNil(o.ErrorMsg) {
		var ret string
		return ret
	}
	return *o.ErrorMsg
}

// GetErrorMsgOk returns a tuple with the ErrorMsg field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MarginBatchPlaceOrderFailureResult) GetErrorMsgOk() (*string, bool) {
	if o == nil || isNil(o.ErrorMsg) {
		return nil, false
	}
	return o.ErrorMsg, true
}

// HasErrorMsg returns a boolean if a field has been set.
func (o *MarginBatchPlaceOrderFailureResult) HasErrorMsg() bool {
	if o != nil && !isNil(o.ErrorMsg) {
		return true
	}

	return false
}

// SetErrorMsg gets a reference to the given string and assigns it to the ErrorMsg field.
func (o *MarginBatchPlaceOrderFailureResult) SetErrorMsg(v string) {
	o.ErrorMsg = &v
}

func (o MarginBatchPlaceOrderFailureResult) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.ClientOid) {
		toSerialize["clientOid"] = o.ClientOid
	}
	if !isNil(o.ErrorMsg) {
		toSerialize["errorMsg"] = o.ErrorMsg
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *MarginBatchPlaceOrderFailureResult) UnmarshalJSON(bytes []byte) (err error) {
	varMarginBatchPlaceOrderFailureResult := _MarginBatchPlaceOrderFailureResult{}

	if err = json.Unmarshal(bytes, &varMarginBatchPlaceOrderFailureResult); err == nil {
		*o = MarginBatchPlaceOrderFailureResult(varMarginBatchPlaceOrderFailureResult)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "clientOid")
		delete(additionalProperties, "errorMsg")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableMarginBatchPlaceOrderFailureResult struct {
	value *MarginBatchPlaceOrderFailureResult
	isSet bool
}

func (v NullableMarginBatchPlaceOrderFailureResult) Get() *MarginBatchPlaceOrderFailureResult {
	return v.value
}

func (v *NullableMarginBatchPlaceOrderFailureResult) Set(val *MarginBatchPlaceOrderFailureResult) {
	v.value = val
	v.isSet = true
}

func (v NullableMarginBatchPlaceOrderFailureResult) IsSet() bool {
	return v.isSet
}

func (v *NullableMarginBatchPlaceOrderFailureResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMarginBatchPlaceOrderFailureResult(val *MarginBatchPlaceOrderFailureResult) *NullableMarginBatchPlaceOrderFailureResult {
	return &NullableMarginBatchPlaceOrderFailureResult{value: val, isSet: true}
}

func (v NullableMarginBatchPlaceOrderFailureResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMarginBatchPlaceOrderFailureResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}