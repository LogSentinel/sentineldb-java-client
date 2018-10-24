package com.logsentinel.sentineldb;

import com.logsentinel.sentineldb.api.DatastoreApi;
import com.logsentinel.sentineldb.api.RecordsApi;
import com.logsentinel.sentineldb.api.SearchApi;
import com.logsentinel.sentineldb.api.UserApi;

/**
 * Main entry point for interacting with LogSentinel APIs
 */
public class SentinelDBClient {

    private DatastoreApi datastoreActions;
    private RecordsApi recordActions;
    private UserApi userActions;
    private SearchApi searchActions;

    public SentinelDBClient(DatastoreApi datastoreActions, RecordsApi recordActions, UserApi userActions,
            SearchApi searchActions) {
        super();
        this.datastoreActions = datastoreActions;
        this.recordActions = recordActions;
        this.userActions = userActions;
        this.searchActions = searchActions;
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
    public UserApi getUserActions() {
        return userActions;
    }
    public void setUserActions(UserApi userActions) {
        this.userActions = userActions;
    }
    public SearchApi getSearchActions() {
        return searchActions;
    }
    public void setSearchActions(SearchApi searchActions) {
        this.searchActions = searchActions;
    }
}
