package com.example.aws.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {
   @DynamoDBAttribute
   private String city;
    @DynamoDBAttribute
   private String state;
    @DynamoDBAttribute
   private long pinCode;
}