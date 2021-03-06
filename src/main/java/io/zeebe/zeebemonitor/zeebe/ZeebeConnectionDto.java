/*
 * Copyright © 2017 camunda services GmbH (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.zeebe.zeebemonitor.zeebe;

import io.zeebe.zeebemonitor.entity.Broker;

public class ZeebeConnectionDto
{

    private Broker broker;
    private boolean connected;

    public ZeebeConnectionDto(Broker broker, boolean connected)
    {
        this.broker = broker;
        this.connected = connected;
    }

    public Broker getBroker()
    {
        return broker;
    }

    public void setBroker(Broker broker)
    {
        this.broker = broker;
    }

    public boolean isConnected()
    {
        return connected;
    }

    public void setConnected(boolean connected)
    {
        this.connected = connected;
    }
}
