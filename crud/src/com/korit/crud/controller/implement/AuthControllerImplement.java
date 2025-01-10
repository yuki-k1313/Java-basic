package com.korit.crud.controller.implement;

import com.korit.crud.controller.AuthController;
import com.korit.crud.dto.auth.SignInRequestDto;
import com.korit.crud.dto.auth.SignUpRequestDto;
import com.korit.crud.service.AuthService;

public class AuthControllerImplement implements AuthController {
	// 비즈니스 로직에 넘겨주기전 유효성 검사 
	
	private final AuthService authService;
	
	public AuthControllerImplement(AuthService authService) {
		this.authService = authService;
	}
	
	@Override
	public void signUp(SignUpRequestDto requestDto) {
		if (requestDto == null) { // 다른 곳에서 참조변수를 받아오면 null 관련해서 작업해야한다.
			System.out.println("오류가 발생했습니다.");
			return;
		}
		if (!requestDto.validate()) {
			return;
		}
		authService.signUp(requestDto);
	}

	@Override
	public void signIn(SignInRequestDto requestDto) {
		if (requestDto == null) {
			System.out.println("오류가 발생했습니다.");
			return;
		}
		if (!requestDto.validate()) {
			return;
		}
		
		authService.signIn(requestDto);
		
	}

}
