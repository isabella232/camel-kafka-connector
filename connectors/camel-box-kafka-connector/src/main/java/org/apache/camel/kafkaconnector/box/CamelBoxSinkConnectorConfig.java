/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.box;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelBoxSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_BOX_PATH_API_NAME_CONF = "camel.sink.path.apiName";
    public static final String CAMEL_SINK_BOX_PATH_API_NAME_DOC = "What kind of operation to perform One of: [COLLABORATIONS] [COMMENTS] [EVENT_LOGS] [FILES] [FOLDERS] [GROUPS] [EVENTS] [SEARCH] [TASKS] [USERS]";
    public static final String CAMEL_SINK_BOX_PATH_API_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_PATH_METHOD_NAME_CONF = "camel.sink.path.methodName";
    public static final String CAMEL_SINK_BOX_PATH_METHOD_NAME_DOC = "What sub operation to use for the selected operation";
    public static final String CAMEL_SINK_BOX_PATH_METHOD_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_CLIENT_ID_CONF = "camel.sink.endpoint.clientId";
    public static final String CAMEL_SINK_BOX_ENDPOINT_CLIENT_ID_DOC = "Box application client ID";
    public static final String CAMEL_SINK_BOX_ENDPOINT_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_ENTERPRISE_ID_CONF = "camel.sink.endpoint.enterpriseId";
    public static final String CAMEL_SINK_BOX_ENDPOINT_ENTERPRISE_ID_DOC = "The enterprise ID to use for an App Enterprise.";
    public static final String CAMEL_SINK_BOX_ENDPOINT_ENTERPRISE_ID_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_IN_BODY_CONF = "camel.sink.endpoint.inBody";
    public static final String CAMEL_SINK_BOX_ENDPOINT_IN_BODY_DOC = "Sets the name of a parameter to be passed in the exchange In Body";
    public static final String CAMEL_SINK_BOX_ENDPOINT_IN_BODY_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_USER_ID_CONF = "camel.sink.endpoint.userId";
    public static final String CAMEL_SINK_BOX_ENDPOINT_USER_ID_DOC = "The user ID to use for an App User.";
    public static final String CAMEL_SINK_BOX_ENDPOINT_USER_ID_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_BOX_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_BOX_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_BOX_ENDPOINT_HTTP_PARAMS_CONF = "camel.sink.endpoint.httpParams";
    public static final String CAMEL_SINK_BOX_ENDPOINT_HTTP_PARAMS_DOC = "Custom HTTP params for settings like proxy host";
    public static final String CAMEL_SINK_BOX_ENDPOINT_HTTP_PARAMS_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_BOX_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_BOX_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_BOX_ENDPOINT_AUTHENTICATION_TYPE_CONF = "camel.sink.endpoint.authenticationType";
    public static final String CAMEL_SINK_BOX_ENDPOINT_AUTHENTICATION_TYPE_DOC = "The type of authentication for connection. Types of Authentication: STANDARD_AUTHENTICATION - OAuth 2.0 (3-legged) SERVER_AUTHENTICATION - OAuth 2.0 with JSON Web Tokens";
    public static final String CAMEL_SINK_BOX_ENDPOINT_AUTHENTICATION_TYPE_DEFAULT = "APP_USER_AUTHENTICATION";
    public static final String CAMEL_SINK_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_CONF = "camel.sink.endpoint.accessTokenCache";
    public static final String CAMEL_SINK_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_DOC = "Custom Access Token Cache for storing and retrieving access tokens.";
    public static final String CAMEL_SINK_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_CLIENT_SECRET_CONF = "camel.sink.endpoint.clientSecret";
    public static final String CAMEL_SINK_BOX_ENDPOINT_CLIENT_SECRET_DOC = "Box application client secret";
    public static final String CAMEL_SINK_BOX_ENDPOINT_CLIENT_SECRET_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_CONF = "camel.sink.endpoint.encryptionAlgorithm";
    public static final String CAMEL_SINK_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_DOC = "The type of encryption algorithm for JWT. Supported Algorithms: RSA_SHA_256 RSA_SHA_384 RSA_SHA_512 One of: [RSA_SHA_256] [RSA_SHA_384] [RSA_SHA_512]";
    public static final String CAMEL_SINK_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_DEFAULT = "RSA_SHA_256";
    public static final String CAMEL_SINK_BOX_ENDPOINT_MAX_CACHE_ENTRIES_CONF = "camel.sink.endpoint.maxCacheEntries";
    public static final String CAMEL_SINK_BOX_ENDPOINT_MAX_CACHE_ENTRIES_DOC = "The maximum number of access tokens in cache.";
    public static final Integer CAMEL_SINK_BOX_ENDPOINT_MAX_CACHE_ENTRIES_DEFAULT = 100;
    public static final String CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_FILE_CONF = "camel.sink.endpoint.privateKeyFile";
    public static final String CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_FILE_DOC = "The private key for generating the JWT signature.";
    public static final String CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_FILE_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_CONF = "camel.sink.endpoint.privateKeyPassword";
    public static final String CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_DOC = "The password for the private key.";
    public static final String CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_PUBLIC_KEY_ID_CONF = "camel.sink.endpoint.publicKeyId";
    public static final String CAMEL_SINK_BOX_ENDPOINT_PUBLIC_KEY_ID_DOC = "The ID for public key for validating the JWT signature.";
    public static final String CAMEL_SINK_BOX_ENDPOINT_PUBLIC_KEY_ID_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters.";
    public static final String CAMEL_SINK_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_USER_NAME_CONF = "camel.sink.endpoint.userName";
    public static final String CAMEL_SINK_BOX_ENDPOINT_USER_NAME_DOC = "Box user name, MUST be provided";
    public static final String CAMEL_SINK_BOX_ENDPOINT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_ENDPOINT_USER_PASSWORD_CONF = "camel.sink.endpoint.userPassword";
    public static final String CAMEL_SINK_BOX_ENDPOINT_USER_PASSWORD_DOC = "Box user password, MUST be provided if authSecureStorage is not set, or returns null on first call";
    public static final String CAMEL_SINK_BOX_ENDPOINT_USER_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_CLIENT_ID_CONF = "camel.component.box.clientId";
    public static final String CAMEL_SINK_BOX_COMPONENT_CLIENT_ID_DOC = "Box application client ID";
    public static final String CAMEL_SINK_BOX_COMPONENT_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_CONFIGURATION_CONF = "camel.component.box.configuration";
    public static final String CAMEL_SINK_BOX_COMPONENT_CONFIGURATION_DOC = "To use the shared configuration";
    public static final String CAMEL_SINK_BOX_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_ENTERPRISE_ID_CONF = "camel.component.box.enterpriseId";
    public static final String CAMEL_SINK_BOX_COMPONENT_ENTERPRISE_ID_DOC = "The enterprise ID to use for an App Enterprise.";
    public static final String CAMEL_SINK_BOX_COMPONENT_ENTERPRISE_ID_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_USER_ID_CONF = "camel.component.box.userId";
    public static final String CAMEL_SINK_BOX_COMPONENT_USER_ID_DOC = "The user ID to use for an App User.";
    public static final String CAMEL_SINK_BOX_COMPONENT_USER_ID_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.box.lazyStartProducer";
    public static final String CAMEL_SINK_BOX_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_BOX_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_BOX_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.box.basicPropertyBinding";
    public static final String CAMEL_SINK_BOX_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_BOX_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_BOX_COMPONENT_HTTP_PARAMS_CONF = "camel.component.box.httpParams";
    public static final String CAMEL_SINK_BOX_COMPONENT_HTTP_PARAMS_DOC = "Custom HTTP params for settings like proxy host";
    public static final String CAMEL_SINK_BOX_COMPONENT_HTTP_PARAMS_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_AUTHENTICATION_TYPE_CONF = "camel.component.box.authenticationType";
    public static final String CAMEL_SINK_BOX_COMPONENT_AUTHENTICATION_TYPE_DOC = "The type of authentication for connection. Types of Authentication: STANDARD_AUTHENTICATION - OAuth 2.0 (3-legged) SERVER_AUTHENTICATION - OAuth 2.0 with JSON Web Tokens";
    public static final String CAMEL_SINK_BOX_COMPONENT_AUTHENTICATION_TYPE_DEFAULT = "APP_USER_AUTHENTICATION";
    public static final String CAMEL_SINK_BOX_COMPONENT_ACCESS_TOKEN_CACHE_CONF = "camel.component.box.accessTokenCache";
    public static final String CAMEL_SINK_BOX_COMPONENT_ACCESS_TOKEN_CACHE_DOC = "Custom Access Token Cache for storing and retrieving access tokens.";
    public static final String CAMEL_SINK_BOX_COMPONENT_ACCESS_TOKEN_CACHE_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_CLIENT_SECRET_CONF = "camel.component.box.clientSecret";
    public static final String CAMEL_SINK_BOX_COMPONENT_CLIENT_SECRET_DOC = "Box application client secret";
    public static final String CAMEL_SINK_BOX_COMPONENT_CLIENT_SECRET_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_ENCRYPTION_ALGORITHM_CONF = "camel.component.box.encryptionAlgorithm";
    public static final String CAMEL_SINK_BOX_COMPONENT_ENCRYPTION_ALGORITHM_DOC = "The type of encryption algorithm for JWT. Supported Algorithms: RSA_SHA_256 RSA_SHA_384 RSA_SHA_512 One of: [RSA_SHA_256] [RSA_SHA_384] [RSA_SHA_512]";
    public static final String CAMEL_SINK_BOX_COMPONENT_ENCRYPTION_ALGORITHM_DEFAULT = "RSA_SHA_256";
    public static final String CAMEL_SINK_BOX_COMPONENT_MAX_CACHE_ENTRIES_CONF = "camel.component.box.maxCacheEntries";
    public static final String CAMEL_SINK_BOX_COMPONENT_MAX_CACHE_ENTRIES_DOC = "The maximum number of access tokens in cache.";
    public static final Integer CAMEL_SINK_BOX_COMPONENT_MAX_CACHE_ENTRIES_DEFAULT = 100;
    public static final String CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_FILE_CONF = "camel.component.box.privateKeyFile";
    public static final String CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_FILE_DOC = "The private key for generating the JWT signature.";
    public static final String CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_FILE_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_PASSWORD_CONF = "camel.component.box.privateKeyPassword";
    public static final String CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_PASSWORD_DOC = "The password for the private key.";
    public static final String CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_PUBLIC_KEY_ID_CONF = "camel.component.box.publicKeyId";
    public static final String CAMEL_SINK_BOX_COMPONENT_PUBLIC_KEY_ID_DOC = "The ID for public key for validating the JWT signature.";
    public static final String CAMEL_SINK_BOX_COMPONENT_PUBLIC_KEY_ID_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.box.sslContextParameters";
    public static final String CAMEL_SINK_BOX_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters.";
    public static final String CAMEL_SINK_BOX_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_USER_NAME_CONF = "camel.component.box.userName";
    public static final String CAMEL_SINK_BOX_COMPONENT_USER_NAME_DOC = "Box user name, MUST be provided";
    public static final String CAMEL_SINK_BOX_COMPONENT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_BOX_COMPONENT_USER_PASSWORD_CONF = "camel.component.box.userPassword";
    public static final String CAMEL_SINK_BOX_COMPONENT_USER_PASSWORD_DOC = "Box user password, MUST be provided if authSecureStorage is not set, or returns null on first call";
    public static final String CAMEL_SINK_BOX_COMPONENT_USER_PASSWORD_DEFAULT = null;

    public CamelBoxSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelBoxSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_BOX_PATH_API_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_PATH_API_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_BOX_PATH_API_NAME_DOC);
        conf.define(CAMEL_SINK_BOX_PATH_METHOD_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_PATH_METHOD_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_BOX_PATH_METHOD_NAME_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_CLIENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_CLIENT_ID_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_ENTERPRISE_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_ENTERPRISE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_ENTERPRISE_ID_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_IN_BODY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_IN_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_IN_BODY_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_USER_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_USER_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_USER_ID_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BOX_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_HTTP_PARAMS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_HTTP_PARAMS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_HTTP_PARAMS_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BOX_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_AUTHENTICATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_AUTHENTICATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_AUTHENTICATION_TYPE_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_CLIENT_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_CLIENT_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_CLIENT_SECRET_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_MAX_CACHE_ENTRIES_CONF, ConfigDef.Type.INT, CAMEL_SINK_BOX_ENDPOINT_MAX_CACHE_ENTRIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_MAX_CACHE_ENTRIES_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_FILE_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_PUBLIC_KEY_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_PUBLIC_KEY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_PUBLIC_KEY_ID_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_USER_NAME_DOC);
        conf.define(CAMEL_SINK_BOX_ENDPOINT_USER_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_ENDPOINT_USER_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_ENDPOINT_USER_PASSWORD_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_CLIENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_CLIENT_ID_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_ENTERPRISE_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_ENTERPRISE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_ENTERPRISE_ID_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_USER_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_USER_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_USER_ID_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BOX_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BOX_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_BOX_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_HTTP_PARAMS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_HTTP_PARAMS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_HTTP_PARAMS_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_AUTHENTICATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_AUTHENTICATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_AUTHENTICATION_TYPE_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_ACCESS_TOKEN_CACHE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_ACCESS_TOKEN_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_ACCESS_TOKEN_CACHE_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_CLIENT_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_CLIENT_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_CLIENT_SECRET_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_ENCRYPTION_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_ENCRYPTION_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_ENCRYPTION_ALGORITHM_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_MAX_CACHE_ENTRIES_CONF, ConfigDef.Type.INT, CAMEL_SINK_BOX_COMPONENT_MAX_CACHE_ENTRIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_MAX_CACHE_ENTRIES_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_FILE_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_PRIVATE_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_PUBLIC_KEY_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_PUBLIC_KEY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_PUBLIC_KEY_ID_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_USER_NAME_DOC);
        conf.define(CAMEL_SINK_BOX_COMPONENT_USER_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BOX_COMPONENT_USER_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BOX_COMPONENT_USER_PASSWORD_DOC);
        return conf;
    }
}