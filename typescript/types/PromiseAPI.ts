import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ErrorInner } from '../model/ErrorInner';
import { ErrorResponse } from '../model/ErrorResponse';
import { UpdateUserFormData } from '../model/UpdateUserFormData';
import { UpdateUserRequest } from '../model/UpdateUserRequest';
import { User } from '../model/User';
import { ObservableUserApi } from './ObservableAPI';

import { UserApiRequestFactory, UserApiResponseProcessor} from "../apis/UserApi";
export class PromiseUserApi {
    private api: ObservableUserApi

    public constructor(
        configuration: Configuration,
        requestFactory?: UserApiRequestFactory,
        responseProcessor?: UserApiResponseProcessor
    ) {
        this.api = new ObservableUserApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * 任意のUserを取得
     * @param userId ユーザーID
     */
    public findUser(userId: string, _options?: Configuration): Promise<User> {
        const result = this.api.findUser(userId, _options);
        return result.toPromise();
    }

    /**
     * User一覧もしくは名前からユーザーを取得
     * @param username ユーザー名
     */
    public getUsersOrGetUserByName(username?: string, _options?: Configuration): Promise<Array<User>> {
        const result = this.api.getUsersOrGetUserByName(username, _options);
        return result.toPromise();
    }

    /**
     * 任意のUserを更新
     * @param userId ユーザーID
     * @param formData 
     * @param profileImage 
     * @param coverImage 
     */
    public updateUser(userId: string, formData?: UpdateUserFormData, profileImage?: HttpFile, coverImage?: HttpFile, _options?: Configuration): Promise<User> {
        const result = this.api.updateUser(userId, formData, profileImage, coverImage, _options);
        return result.toPromise();
    }


}



