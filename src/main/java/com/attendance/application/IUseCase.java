package com.attendance.application;

public interface IUseCase<Input, Output> {
	Output execute(Input input);
}
