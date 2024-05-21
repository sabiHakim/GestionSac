<%@ page import="model.*,java.util.*" %>

<%
ArrayList<Type> types = new Type().getAllType();
ArrayList<Look> looks = new Look().getAllLook();
ArrayList<Employer> emp = new Employer().getAllEmp();

ArrayList<Taille> tailles = new Taille().getAllTaille();
ArrayList<MatierePremiere> mp = new MatierePremiere().getAllMatierePremiere();
%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Pages / Register - NiceAdmin Bootstrap Template</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: NiceAdmin
  * Updated: May 30 2023 with Bootstrap v5.3.0
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <main>
    <div class="container">

      <section class="section register  d-flex flex-column align-items-center justify-content-center py-4">
        <div class="container">
              <!--<div class="container">-->
                  <div class="row">
                            <div class="col-lg-12">
                              <!--<div class="pt-4 pb-2">-->
                                <h5 class=" text-center pb-0 fs-4">Add fabrication poketra</h5>
                                <p class="text-center small">Enter details of your poketra</p>
                              <!--</div>-->
                            </div>
                  </div>
                  <div class="row">
                         <form class="needs-validation"method ="get" action="insertFab">
                                <div class="col-lg-12">
                                    <label class="col-sm-2 col-form-label">Types</label>
                                    <div class="col-12">
                                        <select name="idType" class="form-select" aria-label="Default select example">
                                        <%for(Type type : types){%>
                                        <option value="<%=type.getId()%>"><%=type.getNom()%></option>
                                        <%}%>
                                      </select>
                                    </div>
                                  </div>
                                <!--<div class="col-lg-12">-->
                                  <label for="size" class="form-label">Taille</label>
                                  <select name="idTaille" class="form-select" aria-label="Default select example">
                                        <%for(Taille taille : tailles){%>
                                        <option value="<%=taille.getId()%>"><%=taille.getNom()%></option>
                                        <%}%>
                                      </select>
                                  <div class="invalid-feedback">Please enter the size!</div>
                                <!--</div>-->
                                <div class="row mt-3" id="dd">
                                    <div class=" col-lg-4">
                                        <div class="input-group mb-3 ">
                                            <label class="input-group-text" for="diplome">Employer</label>
                                              <select class="form-select" id="mp" name="mp">
                                                 <%for(Employer emap : emp){%>
                                                    <option value="<%=emap.getId()%>"><%=emap.getTypes()%></option>
                                                 <%}%>
                                              </select>
                                       </div>
                                    </div>
                                    <div class=" col-lg-4">
                                       <div class="input-group mb-3">
                                            <span class="input-group-text" id="basic-addon1">nombre</span>
                                            <input type="text" name="nb"class="form-control" placeholder="quantite" aria-label="Username" aria-describedby="basic-addon1">
                                       </div>
                                    </div>
                                    <div class=" col-lg-4">
                                       <div class="input-group mb-3">
                                            <span class="input-group-text" id="basic-addon1">Nb Heurres</span>
                                            <input type="text" name="heurre"class="form-control" placeholder="quantite" aria-label="Username" aria-describedby="basic-addon1">
                                       </div>
                                    </div>
                                </div>
                                 <div class="row">
                                    <div class="input-group mb-3">
                                        <div class="col-lg-6"><button type="button" class="btn btn-outline-success " id="plus">PLUS</button></div>
                                        <div class="col-lg-6"><button type="button" class="btn btn-outline-danger " id="moin">MOIN</button></div>
                                    </div>
                                </div>
                            </br>
                                <div class="col-12">
                                  <button class="btn btn-primary w-100" type="submit">Valider</button>
                                </div>
                                <!-- <div class="col-12">
                                  <p class="small mb-0">Already have an account? <a href="pages-login.jsp">Log in</a></p>
                                </div> -->
                              </form>
                  </div>
            <!--</div>-->
            </div>

      </section>

    </div>
  </main><!-- End #main -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/chart.js/chart.umd.js"></script>
  <script src="assets/vendor/echarts/echarts.min.js"></script>
  <script src="assets/vendor/quill/quill.min.js"></script>
  <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>
<script>
        var dd = document.getElementById("dd");
        var btn1 =  document.getElementById("plus");
        var btn2 = document.getElementById("moin");
        var moov = ` <div class="row mt-3" id="dd">
                                    <div class=" col-lg-4">
                                        <div class="input-group mb-3 ">
                                            <label class="input-group-text" for="diplome">Employer</label>
                                              <select class="form-select" id="mp" name="mp">
                                                 <%for(Employer emap : emp){%>
                                                    <option value="<%=emap.getId()%>"><%=emap.getTypes()%></option>
                                                 <%}%>
                                              </select>
                                       </div>
                                    </div>
                                    <div class=" col-lg-4">
                                       <div class="input-group mb-3">
                                            <span class="input-group-text" id="basic-addon1">nombre</span>
                                            <input type="text" name="nb"class="form-control" placeholder="quantite" aria-label="Username" aria-describedby="basic-addon1">
                                       </div>
                                    </div>
                                    <div class=" col-lg-4">
                                       <div class="input-group mb-3">
                                            <span class="input-group-text" id="basic-addon1">Nb Heurres</span>
                                            <input type="text" name="heurre"class="form-control" placeholder="quantite" aria-label="Username" aria-describedby="basic-addon1">
                                       </div>
                                    </div>
                                </div>`;

        btn1.addEventListener('click', () => {
            let po  = document.createElement("div");
            po.innerHTML = moov;
            dd.appendChild(po); 
        });
        btn2.addEventListener('click', () => {
          var remove = dd.lastElementChild;
          if (dd.children.length > 3 ) {
            dd.removeChild(remove);
          }
        });
  </script>
</body>

</html>