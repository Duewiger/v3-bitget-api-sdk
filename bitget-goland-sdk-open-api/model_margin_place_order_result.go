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

// MarginPlaceOrderResult struct for MarginPlaceOrderResult
type MarginPlaceOrderResult struct {
	ClientOid            *string `json:"clientOid,omitempty"`
	OrderId              *string `json:"orderId,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _MarginPlaceOrderResult MarginPlaceOrderResult

// NewMarginPlaceOrderResult instantiates a new MarginPlaceOrderResult object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMarginPlaceOrderResult() *MarginPlaceOrderResult {
	this := MarginPlaceOrderResult{}
	return &this
}

// NewMarginPlaceOrderResultWithDefaults instantiates a new MarginPlaceOrderResult object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMarginPlaceOrderResultWithDefaults() *MarginPlaceOrderResult {
	this := MarginPlaceOrderResult{}
	return &this
}

// GetClientOid returns the ClientOid field value if set, zero value otherwise.
func (o *MarginPlaceOrderResult) GetClientOid() string {
	if o == nil || isNil(o.ClientOid) {
		var ret string
		return ret
	}
	return *o.ClientOid
}

// GetClientOidOk returns a tuple with the ClientOid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MarginPlaceOrderResult) GetClientOidOk() (*string, bool) {
	if o == nil || isNil(o.ClientOid) {
		return nil, false
	}
	return o.ClientOid, true
}

// HasClientOid returns a boolean if a field has been set.
func (o *MarginPlaceOrderResult) HasClientOid() bool {
	if o != nil && !isNil(o.ClientOid) {
		return true
	}

	return false
}

// SetClientOid gets a reference to the given string and assigns it to the ClientOid field.
func (o *MarginPlaceOrderResult) SetClientOid(v string) {
	o.ClientOid = &v
}

// GetOrderId returns the OrderId field value if set, zero value otherwise.
func (o *MarginPlaceOrderResult) GetOrderId() string {
	if o == nil || isNil(o.OrderId) {
		var ret string
		return ret
	}
	return *o.OrderId
}

// GetOrderIdOk returns a tuple with the OrderId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MarginPlaceOrderResult) GetOrderIdOk() (*string, bool) {
	if o == nil || isNil(o.OrderId) {
		return nil, false
	}
	return o.OrderId, true
}

// HasOrderId returns a boolean if a field has been set.
func (o *MarginPlaceOrderResult) HasOrderId() bool {
	if o != nil && !isNil(o.OrderId) {
		return true
	}

	return false
}

// SetOrderId gets a reference to the given string and assigns it to the OrderId field.
func (o *MarginPlaceOrderResult) SetOrderId(v string) {
	o.OrderId = &v
}

func (o MarginPlaceOrderResult) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.ClientOid) {
		toSerialize["clientOid"] = o.ClientOid
	}
	if !isNil(o.OrderId) {
		toSerialize["orderId"] = o.OrderId
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *MarginPlaceOrderResult) UnmarshalJSON(bytes []byte) (err error) {
	varMarginPlaceOrderResult := _MarginPlaceOrderResult{}

	if err = json.Unmarshal(bytes, &varMarginPlaceOrderResult); err == nil {
		*o = MarginPlaceOrderResult(varMarginPlaceOrderResult)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "clientOid")
		delete(additionalProperties, "orderId")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableMarginPlaceOrderResult struct {
	value *MarginPlaceOrderResult
	isSet bool
}

func (v NullableMarginPlaceOrderResult) Get() *MarginPlaceOrderResult {
	return v.value
}

func (v *NullableMarginPlaceOrderResult) Set(val *MarginPlaceOrderResult) {
	v.value = val
	v.isSet = true
}

func (v NullableMarginPlaceOrderResult) IsSet() bool {
	return v.isSet
}

func (v *NullableMarginPlaceOrderResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMarginPlaceOrderResult(val *MarginPlaceOrderResult) *NullableMarginPlaceOrderResult {
	return &NullableMarginPlaceOrderResult{value: val, isSet: true}
}

func (v NullableMarginPlaceOrderResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMarginPlaceOrderResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}