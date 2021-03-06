/**
 * Copyright 2016 LinkedIn Corp. All rights reserved.
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
 */
package com.github.ambry.store;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DummyMessageStoreRecovery implements MessageStoreRecovery {

  @Override
  public List<MessageInfo> recover(Read read, long startOffset, long endOffset, StoreKeyFactory factory)
      throws IOException {
    return new ArrayList<MessageInfo>();
  }
}
