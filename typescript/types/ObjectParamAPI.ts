import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ErrorInner } from '../model/ErrorInner';
import { ErrorResponse } from '../model/ErrorResponse';
import { UpdateUserFormData } from '../model/UpdateUserFormData';
import { UpdateUserRequest } from '../model/UpdateUserRequest';
import { User } from '../model/User';

import { ObservableUserApi } from "./ObservableAPI";
import { UserApiRequestFactory, UserApiResponseProcessor} from "../apis/UserApi";

export interface UserApiFindUserRequest {
    /**
     * ユーザーID
     * @type string
     * @memberof UserApifindUser
     */
    userId: string
}

export interface UserApiGetUsersOrGetUserByNameRequest {
    /**
     * ユーザー名
     * @type string
     * @memberof UserApigetUsersOrGetUserByName
     */
    username?: string
}

export interface UserApiUpdateUserRequest {
    /**
     * ユーザーID
     * @type string
     * @memberof UserApiupdateUser
     */
    userId: string
    /**
     * 
     * @type UpdateUserFormData
     * @memberof UserApiupdateUser
     */
    formData?: UpdateUserFormData
    /**
     * 
     * @type HttpFile
     * @memberof UserApiupdateUser
     */
    profileImage?: HttpFile
    /**
     * 
     * @type HttpFile
     * @memberof UserApiupdateUser
     */
    coverImage?: HttpFile
}

export class ObjectUserApi {
    private api: ObservableUserApi

    public constructor(configuration: Configuration, requestFactory?: UserApiRequestFactory, responseProcessor?: UserApiResponseProcessor) {
        this.api = new ObservableUserApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * 任意のUserを取得
     * @param param the request object
     */
    public findUser(param: UserApiFindUserRequest, options?: Configuration): Promise<User> {
        return this.api.findUser(param.userId,  options).toPromise();
    }

    /**
     * User一覧もしくは名前からユーザーを取得
     * @param param the request object
     */
    public getUsersOrGetUserByName(param: UserApiGetUsersOrGetUserByNameRequest = {}, options?: Configuration): Promise<Array<User>> {
        return this.api.getUsersOrGetUserByName(param.username,  options).toPromise();
    }

    /**
     * 任意のUserを更新
     * @param param the request object
     */
    public updateUser(param: UserApiUpdateUserRequest, options?: Configuration): Promise<User> {
        return this.api.updateUser(param.userId, param.formData, param.profileImage, param.coverImage,  options).toPromise();
    }

}
