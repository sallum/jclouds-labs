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
package org.jclouds.abiquo.strategy.enterprise;

import static com.google.common.collect.Iterables.size;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.jclouds.abiquo.domain.cloud.VirtualMachineTemplate;
import org.jclouds.abiquo.strategy.BaseAbiquoStrategyLiveApiTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Live tests for the {@link ListVirtualAppliances} strategy.
 * 
 * @author Ignasi Barrera
 */
@Test(groups = "api", testName = "ListVirtualMachineTemplatesLiveApiTest")
public class ListVirtualMachineTemplatesLiveApiTest extends BaseAbiquoStrategyLiveApiTest {
   private ListVirtualMachineTemplates strategy;

   @Override
   @BeforeClass(groups = "api")
   protected void setupStrategy() {
      this.strategy = env.context.utils().injector().getInstance(ListVirtualMachineTemplates.class);
   }

   public void testExecute() {
      Iterable<VirtualMachineTemplate> templates = strategy.execute(env.defaultEnterprise);
      assertNotNull(templates);
      assertTrue(size(templates) > 0);
   }
}
