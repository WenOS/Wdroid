/*
 * Copyright (c) 2015. Wen (wuziwen@coamc.com && wuziwen_550@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
*/
package android.library.wdroid.common.exception;


/**
 * Author: Copyright (c) Wuziwen(wuziwen@coamc.com) All rights reserved.<br>
 * Date: Create on 2016/2/26 13:39 <br>
 * Title: Wdroid <br>
 * Package: android.library.wdroid.common.exception <br>
 * Description:The base custom exception.
 */
public class W_BaseException extends Exception {

    public W_BaseException() {
        super();
    }

    public W_BaseException(String detailMessage) {
        super(detailMessage);
    }

    public W_BaseException(Throwable throwable) {
        super(throwable.getMessage());
        this.initCause(throwable);
    }

    public W_BaseException(String detailMessage, Throwable throwable) {
        super(detailMessage);
        this.initCause(throwable);
    }
}
