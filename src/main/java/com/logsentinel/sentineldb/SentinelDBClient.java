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
    private BatchApi batchActions;
    private TemplatesApi templatesActions;
    private MessageApi messagesActions;
    private ExternalEncryptionApi externalEncryptionActions;
    private PseudonymizationApi pseudonymizationActions;
    private SqlApi sqlActions;
    private AccessControlApi accessControlActions;
    
    public SentinelDBClient(DatastoreApi datastoreActions, RecordsApi recordActions, UsersApi userActions,
            SearchApi searchActions, SearchSchemaApi schemaActions, OAuthApi oAuthActions, BatchApi batchActions,
            TemplatesApi templatesActions, MessageApi messagesActions, ExternalEncryptionApi externalEncryptionActions, 
            PseudonymizationApi pseudonymizationActions, SqlApi sqlActions, AccessControlApi accessControlActions) {
        this.datastoreActions = datastoreActions;
        this.recordActions = recordActions;
        this.userActions = userActions;
        this.searchActions = searchActions;
        this.schemaActions = schemaActions;
        this.oAuthActions = oAuthActions;
        this.dao = new SentinelDBDao(this);
        this.batchActions = batchActions;
        this.templatesActions = templatesActions;
        this.messagesActions = messagesActions;
        this.externalEncryptionActions = externalEncryptionActions;
        this.pseudonymizationActions = pseudonymizationActions;
        this.sqlActions = sqlActions;
        this.accessControlActions = accessControlActions;
    }
    
    public DatastoreApi getDatastoreActions() {
        return datastoreActions;
    }
    public RecordsApi getRecordActions() {
        return recordActions;
    }
    public UsersApi getUserActions() {
        return userActions;
    }
    public SearchApi getSearchActions() {
        return searchActions;
    }
    public SearchSchemaApi getSchemaActions() {
        return schemaActions;
    }

    public OAuthApi getOAuthActions() {
        return oAuthActions;
    }

    public SentinelDBDao getDao() {
        return dao;
    }

    public BatchApi getBatchActions() {
        return batchActions;
    }

    public TemplatesApi getTemplatesActions() {
        return templatesActions;
    }

    public MessageApi getMessagesActions() {
        return messagesActions;
    }

    public ExternalEncryptionApi getExternalEncryptionActions() {
        return externalEncryptionActions;
    }

    public PseudonymizationApi getPseudonymizationActions() {
        return pseudonymizationActions;
    }

    public SqlApi getSqlActions() {
        return sqlActions;
    }

    public AccessControlApi getAccessControlActions() {
        return accessControlActions;
    }
}
