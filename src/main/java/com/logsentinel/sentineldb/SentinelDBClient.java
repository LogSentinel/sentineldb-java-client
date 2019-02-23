package com.logsentinel.sentineldb;

import com.logsentinel.sentineldb.api.DatastoreApi;
import com.logsentinel.sentineldb.api.RecordsApi;
import com.logsentinel.sentineldb.api.SearchApi;
import com.logsentinel.sentineldb.api.UsersApi;

/**
 * Main entry point for interacting with LogSentinel APIs
 */
public class SentinelDBClient {

    private DatastoreApi datastoreActions;
    private RecordsApi recordActions;
    private UsersApi userActions;
    private SearchApi searchActions;
    private SentinelDBDao dao;
    
    public SentinelDBClient(DatastoreApi datastoreActions, RecordsApi recordActions, UsersApi userActions,
            SearchApi searchActions) {
        super();
        this.datastoreActions = datastoreActions;
        this.recordActions = recordActions;
        this.userActions = userActions;
        this.searchActions = searchActions;
        this.dao = new SentinelDBDao(this);
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

    public SentinelDBDao getDao() {
        return dao;
    }

    public void setDao(SentinelDBDao dao) {
        this.dao = dao;
    }
}
