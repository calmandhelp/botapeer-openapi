import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ErrorInner } from '../model/ErrorInner';
import { ErrorResponse } from '../model/ErrorResponse';
import { User } from '../model/User';

import { ObservableUserApi } from "./ObservableAPI";
import { UserApiRequestFactory, UserApiResponseProcessor} from "../apis/UserApi";

export interface UserApiDeleteUserRequest {
    /**
     * ユーザーID
     * @type string
     * @memberof UserApideleteUser
     */
    userId: string
}

export interface UserApiFindUserByIdRequest {
    /**
     * ユーザーID
     * @type string
     * @memberof UserApifindUserById
     */
    userId: string
}

export interface UserApiFindUserByPlantRecordIdRequest {
    /**
     * 生育記録ID
     * @type string
     * @memberof UserApifindUserByPlantRecordId
     */
    plantRecordId: string
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
     * 任意のUserを削除
     * @param param the request object
     */
    public deleteUser(param: UserApiDeleteUserRequest, options?: Configuration): Promise<User> {
        return this.api.deleteUser(param.userId,  options).toPromise();
    }

    /**
     * 任意のUserを取得
     * @param param the request object
     */
    public findUserById(param: UserApiFindUserByIdRequest, options?: Configuration): Promise<User> {
        return this.api.findUserById(param.userId,  options).toPromise();
    }

    /**
     * 任意のUserをPlantRecordIdから取得
     * @param param the request object
     */
    public findUserByPlantRecordId(param: UserApiFindUserByPlantRecordIdRequest, options?: Configuration): Promise<User> {
        return this.api.findUserByPlantRecordId(param.plantRecordId,  options).toPromise();
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
