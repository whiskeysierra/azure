package io.github.whiskeysierra.archer;

/*-
 * ⁣​
 * Archer: AspectJ
 * ⁣⁣
 * Copyright (C) 2015 - 2018 whiskeysierra
 * ⁣⁣
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ​⁣
 */

import org.example.SomeGateway;
import org.example.SomeLibrary;
import org.example.SomeLogic;
import org.example.SomeModel;
import org.example.SomePersistence;
import org.example.SomeQueue;
import org.example.SomeResource;
import org.example.SomeScheduler;
import org.example.library.GatewayCallingLibrary;
import org.example.library.LibraryCallingLibrary;
import org.example.library.LogicCallingLibrary;
import org.example.library.ModelCallingLibrary;
import org.example.library.PersistenceCallingLibrary;
import org.example.library.QueueCallingLibrary;
import org.example.library.ResourceCallingLibrary;
import org.example.library.SchedulerCallingLibrary;
import org.junit.Test;

import java.io.IOException;

public final class LibraryTest implements Compiling {

    @Override
    public String errorMessage() {
        return LayerPolicy.LIBRARY;
    }

    @Test
    public void shouldFailWhenCallingGateway() throws IOException {
        deny(GatewayCallingLibrary.class, SomeGateway.class);
    }

    @Test
    public void shouldSucceedWhenCallingLibrary() throws IOException {
        allow(LibraryCallingLibrary.class, SomeLibrary.class);
    }

    @Test
    public void shouldFailWhenCallingLogic() throws IOException {
        deny(LogicCallingLibrary.class, SomeLogic.class);
    }

    @Test
    public void shouldSucceedWhenCallingModel() throws IOException {
        allow(ModelCallingLibrary.class, SomeModel.class);
    }

    @Test
    public void shouldFailWhenCallingPersistence() throws IOException {
        deny(PersistenceCallingLibrary.class, SomePersistence.class);
    }

    @Test
    public void shouldFailWhenCallingQueue() throws IOException {
        deny(QueueCallingLibrary.class, SomeQueue.class);
    }

    @Test
    public void shouldFailWhenCallingResource() throws IOException {
        deny(ResourceCallingLibrary.class, SomeResource.class);
    }

    @Test
    public void shouldFailWhenCallingScheduler() throws IOException {
        deny(SchedulerCallingLibrary.class, SomeScheduler.class);
    }

}
