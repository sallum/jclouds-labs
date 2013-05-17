/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.abiquo.events.monitor;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * base class for all monitor events.
 * 
 * @author Ignasi Barrera
 */
public class MonitorEvent<T> {
   /**
    * The type of the event.
    */
   public static enum Type {
      COMPLETED, FAILED, TIMEOUT;
   }

   /** The type of the event. */
   private Type type;

   /** The target object being monitored. */
   private T target;

   public MonitorEvent(final Type type, final T target) {
      super();
      this.type = checkNotNull(type, "type");
      this.target = checkNotNull(target, "target");
   }

   public Type getType() {
      return type;
   }

   public void setType(final Type type) {
      this.type = type;
   }

   public T getTarget() {
      return target;
   }

   public void setTarget(final T target) {
      this.target = target;
   }

   @Override
   public String toString() {
      return "MonitorEvent [type=" + type + ", target=" + target + "]";
   }

}
