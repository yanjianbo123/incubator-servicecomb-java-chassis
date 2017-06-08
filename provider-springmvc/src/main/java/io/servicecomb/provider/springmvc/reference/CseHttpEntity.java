/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.servicecomb.provider.springmvc.reference;

import org.springframework.http.HttpEntity;
import org.springframework.util.MultiValueMap;

import io.servicecomb.swagger.invocation.context.InvocationContext;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author
 * @version  [版本号, 2017年5月27日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class CseHttpEntity<T> extends HttpEntity<T> {

    private InvocationContext context;

    public CseHttpEntity(T body) {
        super(body);
    }

    public CseHttpEntity(MultiValueMap<String, String> headers) {
        super(headers);
    }

    public CseHttpEntity(T body, MultiValueMap<String, String> headers) {
        super(body, headers);
    }

    /**
     * 获取context的值
     * @return 返回 context
     */
    public InvocationContext getContext() {
        return context;
    }

    /**
     * 对context进行赋值
     * @param context context的新值
     */
    public void setContext(InvocationContext context) {
        this.context = context;
    }

    public void addContext(String key, String value) {
        if (context == null) {
            context = new InvocationContext();
        }

        context.addContext(key, value);
    }
}