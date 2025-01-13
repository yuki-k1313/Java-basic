package com.korit.crud;

import java.util.Scanner;

import com.korit.crud.controller.AuthController;
import com.korit.crud.controller.UserController;
import com.korit.crud.controller.implement.AuthControllerImplement;
import com.korit.crud.controller.implement.UserControllerImplement;
import com.korit.crud.dto.auth.SignInRequestDto;
import com.korit.crud.dto.auth.SignUpRequestDto;
import com.korit.crud.dto.user.DeleteSignInUserRequestDto;
import com.korit.crud.dto.user.PatchSignInUserRequestDto;
import com.korit.crud.repository.UserRepository;
import com.korit.crud.repository.implement.UserRepositoryImplement;
import com.korit.crud.service.AuthService;
import com.korit.crud.service.UserService;
import com.korit.crud.service.implement.AuthServiceImplement;
import com.korit.crud.service.implement.UserServiceImplement;

public class CrudApplication {

	public static String SESSION = null;
	
	public static void main(String[] args) {
		
		// 로그인 유저 정보 삭제
		// 입력 -> 비밀번호
		// 출력 -> (성공했습니다.)
		// DTO (null인지만 판단)
		// (UserController, UserService, UserRepository)
		// (deleteSignInUser, deleteById)
		// DIP 준수
		
		UserRepository userRepository = new UserRepositoryImplement();
		AuthService authService = new AuthServiceImplement(userRepository);
		UserService userservice = new UserServiceImplement(userRepository);
		AuthController authController = new AuthControllerImplement(authService);
		UserController userController = new UserControllerImplement(userservice);
	
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			String job = SESSION == null ? 
					"(로그인, 회원가입)" : "(정보보기, 정보수정, 정보삭제)";
			System.out.print("작업 " + job + " : ");
		
			String request = scanner.nextLine();
			
			if (request.equals("exit")) break;
			
			if (request.equals("회원가입")) {
				SignUpRequestDto requestDto = new SignUpRequestDto();
				authController.signUp(requestDto);
			}
			if (request.equals("로그인")) {
				SignInRequestDto requestDto = new SignInRequestDto();
				authController.signIn(requestDto);
			}
			if (request.equals("정보보기")) {
				userController.getSignInUser();
			}
			if (request.equals("정보수정")) {
				PatchSignInUserRequestDto requestDto = new PatchSignInUserRequestDto();
				userController.patchSignInUser(requestDto);
			}
			if (request.equals("정보삭제")) {
				DeleteSignInUserRequestDto requestDto = new DeleteSignInUserRequestDto();
				userController.deleteSignInUser(requestDto);
			}
		}
		
		scanner.close();
		
	}
	
}
