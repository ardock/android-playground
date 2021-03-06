/*
 * Copyright 2016 Martin Kamp Jensen
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

package com.github.mkjensen.androidplayground;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * For code coverage testing purposes.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class UtilsAndroidTest {

  /**
   * For code coverage testing purposes.
   */
  @Test
  public void shouldBeCalledByAndroidTest() {
    Utils.shouldBeCalledByAndroidTest();
    Assert.assertEquals(42, 42);
  }
}
