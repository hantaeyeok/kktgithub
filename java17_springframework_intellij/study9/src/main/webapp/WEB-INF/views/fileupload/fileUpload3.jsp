<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>파일 업로드3</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>

<body>
<!-- App -->
<div id="app">


    <div class="container">
        <!-- Breadcrumbs -->
        <nav>
            <div class="nav-wrapper cyan">
                <div class="col s12">
                    <a href="${path1}" class="breadcrumb" style="padding-left:20px">홈</a>
                    <a href="" class="breadcrumb">파일관리</a>
                    <span class="breadcrumb">파일 업로드</span>
                </div>
            </div>
        </nav>
        <!-- end of Breadcrumbs -->


        <!-- Forms -->
        <div class="row">
            <h4 class="center-align">파일 업로드</h4>
            <hr style="margin-bottom: 50px;">

            <form class="col s12 l6 offset-l3" action="fileUpload3" method="post" enctype="multipart/form-data">

                <!--                     <div class="row">
                                        <button type="button" class="btn-small waves-effect waves-light" id="btnAddFile">파일 추가</button>
                                    </div> -->

                <div class="row" id="fileContainer">
                    <div class="file-field input-field col s12">
                        <div class="btn">
                            <span><i class="material-icons left">attach_file</i>첨부 파일</span>
                            <input type="file" name="files">
                        </div>
                        <div class="file-path-wrapper">
                            <input type="text" class="file-path validate">
                        </div>
                        <span class="helper-text">첨부파일로 업로드 가능한 용량은 최대 50MB 입니다.</span>
                    </div>
                </div>

                <div class="row center-align">
                    <div class="col s12 l8 offset-l2">
                        <div class="col s6">
                            <button type="submit" class="btn-large waves-effect waves-light">
                                <i class="material-icons left">file_upload</i>
                                업로드
                            </button>
                        </div>
                        <div class="col s6">
                            <a class="btn-large waves-effect waves-light" href="/file/list">
                                <i class="material-icons left">list</i>
                                목록
                            </a>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <blockquote>
                        [파일 업로드] 버튼을 눌러서 새 파일을 업로드해 보세요.<br>
                        새 파일을 업로드 하지 않고 파일 목록으로 가시려면 [파일 목록] 버튼을 누르세요.
                    </blockquote>
                </div>
            </form>
        </div>
        <!-- end of Forms -->


    </div>
    <!-- end of Container -->


    <!-- Footer -->

    <!-- end of Footer -->

</div>
<!-- end of App -->



<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script>
    const sideNav = document.querySelector('.sidenav');
    M.Sidenav.init(sideNav, {});
</script>
<script>
    var fileContainer = document.querySelector('#fileContainer');

    var btnAddFile = document.querySelector('#btnAddFile');

    var fileCount = 1; // 첨부파일 선택상자 개수

    btnAddFile.addEventListener('click', function () {
        if (fileCount >= 5) {
            alert('첨부파일은 최대 5개까지만 업로드 가능합니다.')
            return;
        }
        fileCount++; // 추가된 첨부파일 선택상자 개수 반영

        var input = '<div class="file-field input-field col s12"><div class="btn"><span><i class="material-icons left">attach_file</i>첨부 파일</span><input type="file" name="files" multiple></div><div class="file-path-wrapper"><input type="text" class="file-path validate"></div><span class="helper-text">첨부파일로 업로드 가능한 용량은 최대 50MB 입니다.</span></div>';

        fileContainer.innerHTML += input;
    });

</script>
</body>

</html>