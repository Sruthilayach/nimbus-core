/**
 *  Copyright 2016-2019 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.antheminc.oss.nimbus.domain.model.state.repo.db.rdbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.antheminc.oss.nimbus.app.extension.config.DefaultCoreConfigMarker;
import com.antheminc.oss.nimbus.context.BeanResolverStrategy;
import com.antheminc.oss.nimbus.domain.session.SessionProvider;
import com.antheminc.oss.nimbus.test.domain.session.TestSessionProvider;

/**
 * @author Tony Lopez
 *
 */
@SpringBootApplication(scanBasePackageClasses = {RdbmsRepositoryTestApplication.class, DefaultCoreConfigMarker.class})
public class RdbmsRepositoryTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdbmsRepositoryTestApplication.class, args);
	}

	@Bean
	public SessionProvider sessionProvider(BeanResolverStrategy beanResolver) {
		return new TestSessionProvider();
	}
}
