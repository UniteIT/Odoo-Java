/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arnowouter.javaodoo;

import com.arnowouter.javaodoo.exceptions.OdooConnectorException;
import com.arnowouter.javaodoo.supportClasses.OdooVersionInfo;
import java.util.HashMap;

/**
 *
 * @author Arno
 */
public interface OdooConnector {
    public int authenticate() throws OdooConnectorException;
    public OdooVersionInfo getVersion() throws OdooConnectorException;
    public Object[] getAllFieldsForModel(String model) throws OdooConnectorException;
    public Object[] read(String model, Object[] requestedIds, Object[] requestedFields) throws OdooConnectorException;
    public Object[] search(String model, Object[] query) throws OdooConnectorException;
    public int count(String model, Object[] query) throws OdooConnectorException;
    public Object[] searchAndRead(String model, Object[] requestedFields) throws OdooConnectorException;
    public Object[] searchAndRead(String model, Object[] query, Object[] requestedFields) throws OdooConnectorException;
    public int createRecord(String model, HashMap<String, String> dataToCreate) throws OdooConnectorException;
    public int updateRecord(String model, HashMap<String, String> dataToUpdate) throws OdooConnectorException;
    public void deleteRecords(String model, Object[] idsToBeDeleted) throws OdooConnectorException;
}
