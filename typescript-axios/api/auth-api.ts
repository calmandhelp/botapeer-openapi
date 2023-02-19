/* tslint:disable */
/* eslint-disable */
/**
 * Botapeer API
 * Botapeer API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import type { Configuration } from '../configuration';
import type { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import globalAxios from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { CreateUserRequest } from '../model';
// @ts-ignore
import { ErrorResponse } from '../model';
// @ts-ignore
import { JwtAuthenticationResponse } from '../model';
// @ts-ignore
import { SignInRequest } from '../model';
/**
 * AuthApi - axios parameter creator
 * @export
 */
export const AuthApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * サインアップ
         * @param {CreateUserRequest} createUserRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createUser: async (createUserRequest: CreateUserRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'createUserRequest' is not null or undefined
            assertParamExists('createUser', 'createUserRequest', createUserRequest)
            const localVarPath = `/auth/signup`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(createUserRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * サインイン
         * @param {SignInRequest} signInRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        signin: async (signInRequest: SignInRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'signInRequest' is not null or undefined
            assertParamExists('signin', 'signInRequest', signInRequest)
            const localVarPath = `/auth/signin`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(signInRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * AuthApi - functional programming interface
 * @export
 */
export const AuthApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = AuthApiAxiosParamCreator(configuration)
    return {
        /**
         * サインアップ
         * @param {CreateUserRequest} createUserRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createUser(createUserRequest: CreateUserRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<JwtAuthenticationResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.createUser(createUserRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * サインイン
         * @param {SignInRequest} signInRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async signin(signInRequest: SignInRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<JwtAuthenticationResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.signin(signInRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * AuthApi - factory interface
 * @export
 */
export const AuthApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = AuthApiFp(configuration)
    return {
        /**
         * サインアップ
         * @param {CreateUserRequest} createUserRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createUser(createUserRequest: CreateUserRequest, options?: any): AxiosPromise<JwtAuthenticationResponse> {
            return localVarFp.createUser(createUserRequest, options).then((request) => request(axios, basePath));
        },
        /**
         * サインイン
         * @param {SignInRequest} signInRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        signin(signInRequest: SignInRequest, options?: any): AxiosPromise<JwtAuthenticationResponse> {
            return localVarFp.signin(signInRequest, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * AuthApi - object-oriented interface
 * @export
 * @class AuthApi
 * @extends {BaseAPI}
 */
export class AuthApi extends BaseAPI {
    /**
     * サインアップ
     * @param {CreateUserRequest} createUserRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthApi
     */
    public createUser(createUserRequest: CreateUserRequest, options?: AxiosRequestConfig) {
        return AuthApiFp(this.configuration).createUser(createUserRequest, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * サインイン
     * @param {SignInRequest} signInRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AuthApi
     */
    public signin(signInRequest: SignInRequest, options?: AxiosRequestConfig) {
        return AuthApiFp(this.configuration).signin(signInRequest, options).then((request) => request(this.axios, this.basePath));
    }
}
