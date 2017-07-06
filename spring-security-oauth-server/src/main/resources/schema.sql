drop table if exists oauth_client_details;
create table oauth_client_details (
  client_id VARCHAR(255) PRIMARY KEY,
  resource_ids VARCHAR(255),
  client_secret VARCHAR(255),
  scope VARCHAR(255),
  authorized_grant_types VARCHAR(255),
  web_server_redirect_uri VARCHAR(255),
  authorities VARCHAR(255),
  access_token_validity INTEGER,
  refresh_token_validity INTEGER,
  additional_information VARCHAR(4096),
  autoapprove VARCHAR(255)
);

create table if not exists oauth_client_token (
  token_id VARCHAR(255),
  token LONG VARBINARY,
  authentication_id VARCHAR(255) PRIMARY KEY,
  user_name VARCHAR(255),
  client_id VARCHAR(255)
);

create table if not exists oauth_access_token (
  token_id VARCHAR(255),
  token LONG VARBINARY,
  authentication_id VARCHAR(255) PRIMARY KEY,
  user_name VARCHAR(255),
  client_id VARCHAR(255),
  authentication LONG VARBINARY,
  refresh_token VARCHAR(255)
);

create table if not exists oauth_refresh_token (
  token_id VARCHAR(255),
  token LONG VARBINARY,
  authentication LONG VARBINARY
);

create table if not exists oauth_code (
  code VARCHAR(255), authentication LONG VARBINARY
);

create table if not exists oauth_approvals (
	userId VARCHAR(255),
	clientId VARCHAR(255),
	scope VARCHAR(255),
	status VARCHAR(10),
	expiresAt TIMESTAMP,
	lastModifiedAt TIMESTAMP
);

create table if not exists ClientDetails (
  appId VARCHAR(255) PRIMARY KEY,
  resourceIds VARCHAR(255),
  appSecret VARCHAR(255),
  scope VARCHAR(255),
  grantTypes VARCHAR(255),
  redirectUrl VARCHAR(255),
  authorities VARCHAR(255),
  access_token_validity INTEGER,
  refresh_token_validity INTEGER,
  additionalInformation VARCHAR(4096),
  autoApproveScopes VARCHAR(255)
);

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    user_id INTEGER PRIMARY KEY auto_increment,
    username VARCHAR(128) UNIQUE,
    password VARCHAR(256),
    enabled BOOL
);

INSERT INTO users (user_id, username, password, enabled) VALUES 
	('1', 'peter@example.com', '$2a$10$D4OLKI6yy68crm.3imC9X.P2xqKHs5TloWUcr6z5XdOqnTrAK84ri', true),
	('2', 'john@example.com', '$2a$10$D4OLKI6yy68crm.3imC9X.P2xqKHs5TloWUcr6z5XdOqnTrAK84ri', true),
	('3', 'katie@example.com', '$2a$10$D4OLKI6yy68crm.3imC9X.P2xqKHs5TloWUcr6z5XdOqnTrAK84ri', true);
	
	
	-- -----------------------------------------------------
-- Table `customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS customer;
CREATE TABLE customer(
    id                      VARCHAR(100)      NOT NULL PRIMARY KEY,
    nickname                VARCHAR(255)      NULL,
    names                   VARCHAR(255)      NULL,
    lastname                VARCHAR(255)      NULL, 
    second_lastname         VARCHAR(255)      NULL,
    dni                     VARCHAR(255)      NOT NULL,
    codclavecic             VARCHAR(255)      NULL,
    codunicocli             VARCHAR(255)      NULL,
    profile_risk            VARCHAR(100)      NULL,
    profile_risk_other      VARCHAR(100)      NULL,
    journey                 VARCHAR(100)      NULL,
    enabled                 BIT(1)            NOT NULL DEFAULT 1,
    creation_time           DATETIME          NOT NULL	DEFAULT	CURRENT_TIMESTAMP,
    update_time             DATETIME          NOT NULL	DEFAULT	CURRENT_TIMESTAMP
);

INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Jose', 'Sanchez', 'Rodriguez', '880c39b41754918345d10b5fcee443ad08e1d49ff979f47382d327fffff0abdd', '12345678','0000456734561');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Rodrigo', 'Caceres', 'Rivero', '035ade7b354c7dffaf233f9713afb4fab566eb4dc4c7f48c9e0e4a2036432baf', '12345678','0000475689701');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Mateo', 'Weis', 'Caceres', '3d64c2e2a05b2de74988ec35514b39702a33a2c821eb241ae51c95f7807bf742', '12345678','0000475689711');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Sofia', 'Aguirre', 'Linares', '2fae1fef6883dd2ad9d293b9e27e12ff40fa17914d4271cb83f7f4897d97803b', '12345678','0000475689721');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Camila', 'Linares', 'Weis', '8905fc39e401564cb1d9b243a960465217623fabaa94a5f2d021a651b3088b50', '12345678','0000475689731');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Rafaella', 'Rodriguez', 'Rivera', '2ca35cd7578c60652eb53061d9cdb3418c8ecfa4df304bcd97323b7a75da87c2', '12345678','0000475689741');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Valeria', 'Carrion', 'Linares', 'b419c84c5e13c0b80ccdcc8a9a3434a063daeef3acf011548d5b82c4af91294f', '12345678','0000475689751');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Jose', 'Rivera', 'Zavala', '23f3dd0dc43819ff95b6559ed11b90dfa12f6b1a667c7c946670f4c4837df245', '12345678','0000475689761');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Jorge', 'Garcia', 'Carrion', '155ded18c1857d1d488253c35d63e339e42c10a239e1d80dfee1847e39b63a8c', '12345678','0000475689771');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Sandra', 'Garcez', 'Daza', '52220dee6a8d8af73922b29f3080d266900b02fcc3c33f71ac4ec402dba99288', '12345678','0000475689781');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Valentin', 'Corcuera', 'Lozano', '3c8075efa59779cacd705ba7d9892b8303216c3e2fab94fb9fa0541ed7208cb9', '12345678','0000475689791');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Ramiro', 'Zavala', 'Garcez', '8cadd69a667f9ab8ea313543182662cdbbbe7cecfe2429fa8ec0b0d58b34beaa', '12345678','0000475689801');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Sandro', 'Lozano', 'Rivera', '17dc59348b8b0e7ade4d1a65497ebe99efd4e65a9d54fb93847a0625d36278c9', '12345678','0000475689811');
INSERT INTO customer(id, names, lastname, second_lastname, dni, codclavecic, codunicocli) VALUES (UUID(), 'Paola', 'Daza', 'Carrion', 'aeb19b7bb746e5cb395da770e926f2304febcb83f3ef2aa8459bcaaa52ddfe70', '12345678','0000475689821');
