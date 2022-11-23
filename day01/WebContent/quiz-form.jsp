<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz-form.jsp</title>
<style>
        #wrap{
            width: 100%;
            display: block;
        }
        #header {
            border: 1px solid #dadada;

        }

        .logo {
            border: 1px solid #dadada;
            display: inline-block;
            margin-left: 50%;
            margin-block-end: auto;
            

        }
    </style>
</head>
<body>
 <div id="wrap">
 
        <header>
            <div id="header" class="join_membership">
                <h1 class="logo">
                    <a>naver</a>
                </h1>
            </div>
        </header>



        <main>
            <div id="container">
                <div class="row_group">
                    <h3>아이디</h3>
                </div>
                <div>
                    <input type="email" name="id"></input>
                    <a>@naver.com</a>
                </div>
                <div>
                    <h3>비밀번호</h3>
                </div>
                <div>
                    <input type="password" name="pw"></input>
                </div>
                <div>
                    <h3>비밀번호 재확인</h3>
                </div>
                <div>
                    <input type="password" name="pw"></input>
                </div>
                <div>
                    <h3>이름</h3>
                </div>
                <div>
                    <input type="text">
                </div>
                <div>
                    <h3>생년월일</h3>
                </div>
                <div>
                </div>
                <div>
                    <input type="text">
                </div>
                <div>
                    <select id="mm" class="sel" aria-label="월">
                        <option value="">월</option>
                        <option value="01">
                            1
                        </option>
                        <option value="02">
                            2
                        </option>
                        <option value="03">
                            3
                        </option>
                        <option value="04">
                            4
                        </option>
                        <option value="05">
                            5
                        </option>
                        <option value="06">
                            6
                        </option>
                        <option value="07">
                            7
                        </option>
                        <option value="08">
                            8
                        </option>
                        <option value="09">
                            9
                        </option>
                        <option value="10">
                            10
                        </option>
                        <option value="11">
                            11
                        </option>
                        <option value="12">
                            12
                        </option>
                    </select>
                    <input type="">
                </div>
                <div>
                    <input type="text">
                </div>
                <div>
                    <h3>성별</h3>
                </div>
                <div>
                
                    <select>
                        <option>남자</option>
                        <option>여자</option>
                        <option>선택안함</option>
                    </select>
                </div>
                <div>본인 확인 이메일(선택)</div>
                <div>
                    <input type="email">
                </div>
                <div>휴대전화</div>
                <select>
                    <option>한국</option>
                    <option>미국</option>
                    <option>영국</option>
                    <option>일본</option>
                    <option>중국</option>
                </select>
                <div>
                    <input type="number">
                </div>
                <div><a>인증번호받기</a></div>
                <div>
                    <input type="number">
                </div>
                <div>
                    <button>가입하기</button>
                </div>
                






        </main>

        <footer>
            <div id="footer">

            </div>

        </footer>
    </div>

</body>
</html>