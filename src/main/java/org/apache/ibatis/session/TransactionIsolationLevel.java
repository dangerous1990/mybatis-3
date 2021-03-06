/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.session;

import java.sql.Connection;

/**
 * 事务隔离
 * @author Clinton Begin
 */
public enum TransactionIsolationLevel {
  NONE(Connection.TRANSACTION_NONE),//无事务
  READ_COMMITTED(Connection.TRANSACTION_READ_COMMITTED),//读已提交
  READ_UNCOMMITTED(Connection.TRANSACTION_READ_UNCOMMITTED),//读未提交
  REPEATABLE_READ(Connection.TRANSACTION_REPEATABLE_READ),//可重复读
  SERIALIZABLE(Connection.TRANSACTION_SERIALIZABLE);//悲观锁

  private final int level;

  private TransactionIsolationLevel(int level) {
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}
