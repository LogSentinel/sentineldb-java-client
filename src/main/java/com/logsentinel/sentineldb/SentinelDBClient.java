package com.logsentinel.sentineldb;

import com.logsentinel.sentineldb.api.*;

/**
 * Main entry point for interacting with LogSentinel APIs
 */
public class SentinelDBClient {

    private DatastoreApi datastoreActions;
    private RecordsApi recordActions;
    private UsersApi userActions;
    private SearchApi searchActions;
    private SearchSchemaApi schemaActions;
    private OAuthApi oAuthActions;
    private SentinelDBDao dao;
    private BatchApi batchApi;
    
    public SentinelDBClient(DatastoreApi datastoreActions, RecordsApi recordActions, UsersApi userActions,
            SearchApi searchActions, SearchSchemaApi schemaActions, OAuthApi oAuthActions, BatchApi batchApi) {
        super();
        this.datastoreActions = datastoreActions;
        this.recordActions = recordActions;
        this.userActions = userActions;
        this.searchActions = searchActions;
        this.schemaActions = schemaActions;
        this.oAuthActions = oAuthActions;
        this.dao = new SentinelDBDao(this);
        this.batchApi = batchApi;
    }
    
    public DatastoreApi getDatastoreActions() {
        return datastoreActions;
    }
    public void setDatastoreActions(DatastoreApi datastoreActions) {
        this.datastoreActions = datastoreActions;
    }
    public RecordsApi getRecordActions() {
        return recordActions;
    }
    public void setRecordActions(RecordsApi recordActions) {
        this.recordActions = recordActions;
    }
    public UsersApi getUserActions() {
        return userActions;
    }
    public void setUserActions(UsersApi userActions) {
        this.userActions = userActions;
    }
    public SearchApi getSearchActions() {
        return searchActions;
    }
    public void setSearchActions(SearchApi searchActions) {
        this.searchActions = searchActions;
    }

    public SearchSchemaApi getSchemaActions() {
        return schemaActions;
    }

    public void setSchemaActions(SearchSchemaApi schemaActions) {
        this.schemaActions = schemaActions;
    }

    public OAuthApi getOAuthActions() {
        return oAuthActions;
    }

    public void setOAuthActions(OAuthApi oAuthActions) {
        this.oAuthActions = oAuthActions;
    }

    public SentinelDBDao getDao() {
        return dao;
    }

    public void setDao(SentinelDBDao dao) {
        this.dao = dao;
    }

    public BatchApi getBatchApi() {
        return batchApi;
    }

    public void setBatchApi(BatchApi batchApi) {
        this.batchApi = batchApi;
    }
}
