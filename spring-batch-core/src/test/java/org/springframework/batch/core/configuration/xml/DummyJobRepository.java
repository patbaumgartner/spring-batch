/*
 * Copyright 2006-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.batch.core.configuration.xml;

import java.util.Collection;

import org.springframework.batch.core.job.JobExecution;
import org.springframework.batch.core.job.JobInstance;
import org.springframework.batch.core.job.parameters.JobParameters;
import org.springframework.batch.core.step.StepExecution;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.lang.Nullable;

/**
 * @author Dan Garrette
 * @author David Turanski
 * @author Mahmoud Ben Hassine
 * @author Parikshit Dutta
 * @since 2.0.1
 */
public class DummyJobRepository implements JobRepository, BeanNameAware {

	private String name;

	public String getName() {
		return name;
	}

	@Override
	public void setBeanName(String name) {
		this.name = name;
	}

	@Override
	public void add(StepExecution stepExecution) {
	}

	@Override
	public JobExecution createJobExecution(String jobName, JobParameters jobParameters)
			throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		return null;
	}

	@Nullable
	@Override
	public JobInstance getJobInstance(String jobName, JobParameters jobParameters) {
		return null;
	}

	@Nullable
	@Override
	public JobExecution getLastJobExecution(String jobName, JobParameters jobParameters) {
		return null;
	}

	@Nullable
	@Override
	public StepExecution getLastStepExecution(JobInstance jobInstance, String stepName) {
		return null;
	}

	@Override
	public long getStepExecutionCount(JobInstance jobInstance, String stepName) {
		return 0;
	}

	@SuppressWarnings("removal")
	@Override
	public boolean isJobInstanceExists(String jobName, JobParameters jobParameters) {
		return false;
	}

	@Override
	public void update(JobExecution jobExecution) {
	}

	@Override
	public void update(StepExecution stepExecution) {
	}

	@Override
	public void updateExecutionContext(StepExecution stepExecution) {
	}

	@Override
	public void updateExecutionContext(JobExecution jobExecution) {
	}

	@Override
	public void addAll(Collection<StepExecution> stepExecutions) {
	}

	@Override
	public JobInstance createJobInstance(String jobName, JobParameters jobParameters) {
		return null;
	}

}
