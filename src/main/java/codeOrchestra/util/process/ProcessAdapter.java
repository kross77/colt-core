/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package codeOrchestra.util.process;

import codeOrchestra.colt.core.execution.ProcessEvent;
import codeOrchestra.colt.core.execution.ProcessListener;

public abstract class ProcessAdapter implements ProcessListener {
  public void startNotified(final ProcessEvent event) {
  }

  public void processTerminated(final ProcessEvent event) {
  }

  public void processWillTerminate(ProcessEvent event, boolean willBeDestroyed) {
  }

  public void onTextAvailable(final ProcessEvent event, final String outputType) {
  }
}