<%@ page import="model.*,java.util.*,java.time.*" %>

<%
ArrayList<Type> types = new Type().getAllType();
ArrayList<Client> clients = new Client().getAll();
%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Components / Accordion - NiceAdmin Bootstrap Template</title>
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

  <!-- ======= Header ======= -->
  <header id="header" class="header fixed-top d-flex align-items-center">

    <div class="d-flex align-items-center justify-content-between">
      <a href="index.jsp" class="logo d-flex align-items-center">
        <img src="assets/img/logo.png" alt="">
        <span class="d-none d-lg-block">NiceAdmin</span>
      </a>
      <i class="bi bi-list toggle-sidebar-btn"></i>
    </div><!-- End Logo -->

    <div class="search-bar">
      <form class="search-form d-flex align-items-center" method="POST" action="#">
        <input type="text" name="query" placeholder="Search" title="Enter search keyword">
        <button type="submit" title="Search"><i class="bi bi-search"></i></button>
      </form>
    </div><!-- End Search Bar -->

    <nav class="header-nav ms-auto">
      <ul class="d-flex align-items-center">

        <li class="nav-item d-block d-lg-none">
          <a class="nav-link nav-icon search-bar-toggle " href="#">
            <i class="bi bi-search"></i>
          </a>
        </li><!-- End Search Icon-->

        <li class="nav-item dropdown">

          <a class="nav-link nav-icon" href="#" data-bs-toggle="dropdown">
            <i class="bi bi-bell"></i>
            <span class="badge bg-primary badge-number">4</span>
          </a><!-- End Notification Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow notifications">
            <li class="dropdown-header">
              You have 4 new notifications
              <a href="#"><span class="badge rounded-pill bg-primary p-2 ms-2">View all</span></a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="notification-item">
              <i class="bi bi-exclamation-circle text-warning"></i>
              <div>
                <h4>Lorem Ipsum</h4>
                <p>Quae dolorem earum veritatis oditseno</p>
                <p>30 min. ago</p>
              </div>
            </li>

            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="notification-item">
              <i class="bi bi-x-circle text-danger"></i>
              <div>
                <h4>Atque rerum nesciunt</h4>
                <p>Quae dolorem earum veritatis oditseno</p>
                <p>1 hr. ago</p>
              </div>
            </li>

            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="notification-item">
              <i class="bi bi-check-circle text-success"></i>
              <div>
                <h4>Sit rerum fuga</h4>
                <p>Quae dolorem earum veritatis oditseno</p>
                <p>2 hrs. ago</p>
              </div>
            </li>

            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="notification-item">
              <i class="bi bi-info-circle text-primary"></i>
              <div>
                <h4>Dicta reprehenderit</h4>
                <p>Quae dolorem earum veritatis oditseno</p>
                <p>4 hrs. ago</p>
              </div>
            </li>

            <li>
              <hr class="dropdown-divider">
            </li>
            <li class="dropdown-footer">
              <a href="#">Show all notifications</a>
            </li>

          </ul><!-- End Notification Dropdown Items -->

        </li><!-- End Notification Nav -->

        <li class="nav-item dropdown">

          <a class="nav-link nav-icon" href="#" data-bs-toggle="dropdown">
            <i class="bi bi-chat-left-text"></i>
            <span class="badge bg-success badge-number">3</span>
          </a><!-- End Messages Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow messages">
            <li class="dropdown-header">
              You have 3 new messages
              <a href="#"><span class="badge rounded-pill bg-primary p-2 ms-2">View all</span></a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="message-item">
              <a href="#">
                <img src="assets/img/messages-1.jpg" alt="" class="rounded-circle">
                <div>
                  <h4>Maria Hudson</h4>
                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>
                  <p>4 hrs. ago</p>
                </div>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="message-item">
              <a href="#">
                <img src="assets/img/messages-2.jpg" alt="" class="rounded-circle">
                <div>
                  <h4>Anna Nelson</h4>
                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>
                  <p>6 hrs. ago</p>
                </div>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="message-item">
              <a href="#">
                <img src="assets/img/messages-3.jpg" alt="" class="rounded-circle">
                <div>
                  <h4>David Muldon</h4>
                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>
                  <p>8 hrs. ago</p>
                </div>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li class="dropdown-footer">
              <a href="#">Show all messages</a>
            </li>

          </ul><!-- End Messages Dropdown Items -->

        </li><!-- End Messages Nav -->

        <li class="nav-item dropdown pe-3">

          <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
            <img src="assets/img/profile-img.jpg" alt="Profile" class="rounded-circle">
            <span class="d-none d-md-block dropdown-toggle ps-2">K. Anderson</span>
          </a><!-- End Profile Iamge Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
            <li class="dropdown-header">
              <h6>Kevin Anderson</h6>
              <span>Web Designer</span>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="users-profile.jsp">
                <i class="bi bi-person"></i>
                <span>My Profile</span>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="users-profile.jsp">
                <i class="bi bi-gear"></i>
                <span>Account Settings</span>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="pages-faq.jsp">
                <i class="bi bi-question-circle"></i>
                <span>Need Help?</span>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="#">
                <i class="bi bi-box-arrow-right"></i>
                <span>Sign Out</span>
              </a>
            </li>

          </ul><!-- End Profile Dropdown Items -->
        </li><!-- End Profile Nav -->

      </ul>
    </nav><!-- End Icons Navigation -->

  </header><!-- End Header -->

   <aside id="sidebar" class="sidebar">
      
    <ul class="sidebar-nav" id="sidebar-nav">  
      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#components-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span>Ajout</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="components-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
                  <li class="nav-item">
                  <a  href="Embauche.jsp">
                    <i class="bi bi-circle"></i>
                    <span>Embauche</span>
                  </a>
                </li>
                <li class="nav-item">
                  <a  href="page-ajout-genre.jsp">
                    <i class="bi bi-circle"></i>
                    <span>Ajout genre</span>
                  </a>
                </li>
                <li class="nav-item">
                  <a  href="page-ajout-client.jsp">
                    <i class="bi bi-circle"></i>
                    <span>Ajout client</span>
                  </a>
                </li>
                <li class="nav-item">
                  <a  href="page-ajout-vente.jsp">
                    <i class="bi bi-circle"></i>
                    <span>Ajout vente</span>
                  </a>
                </li>
                <li class="nav-item">
                  <a  href="page-ajout-poketra.jsp">
                    <i class="bi bi-circle"></i>
                    <span>Ajout poketra</span>
                  </a>
                </li><!-- add poketra link -->
                       <li class="nav-item">
                        <a  href="Fabrication.jsp">
                          <i class="bi bi-circle"></i>
                          <span>Fabrications</span>
                        </a>
                      </li><!-- front office -->

                    <li class="nav-item">
                    <a href="Employer.jsp">
                      <i class="bi bi-circle"></i>
                      <span>Ajout Employer</span>
                    </a>
                  </li><!-- front office -->

                    <li class="nav-item">
                      <a  href="page_ajout_commande.jsp">
                        <i class="bi bi-circle"></i>
                        <span>Ajout Commande</span>
                      </a>
                    </li><!-- front office -->

                    <li class="nav-item">
                      <a  href="page_ajout_stock.jsp">
                        <i class="bi bi-circle"></i>
                        <span>Ajout Stock</span>
                      </a>
                    </li><!-- front office -->
                    
                    <li class="nav-item">
                      <a href="page-ajout-look.jsp">
                        <i class="bi bi-circle"></i>
                        <span>Ajouter Look</span>
                      </a>
                    </li><!-- front office -->

                    <li class="nav-item">
                      <a  href="page-ajout-type.jsp">
                        <i class="bi bi-circle"></i>
                        <span>Ajouter type</span>
                      </a>
                    </li><!-- front office -->
                        
                    <li class="nav-item">
                      <a  href="page-ajout-matierePrem.jsp">
                        <i class="bi bi-circle"></i>
                        <span>Ajouter matiere premiere</span>
                      </a>
                    </li><!-- front office -->
                      <li class="nav-item">
                      <a  href="page-ajout-taille.jsp">
                        <i class="bi bi-circle"></i>
                        <span>Ajouter Taille</span>
                      </a>
                    </li><!-- front office -->
        </ul>
      </li><!-- End Components Nav1 -->
            <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#forms-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-journal-text"></i><span>Listes</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="forms-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
                             <li >
                              <a  href="ListEmp">
                                <i class="bi bi-circle"></i>
                                <span>Liste Emp</span>
                              </a>
                            </li><!-- front office -->
                            <li >
                              <a  href="page-list-look.jsp">
                                <i class="bi bi-circle"></i>
                                <span>Liste Look</span>
                              </a>
                            </li><!-- front office -->


                            <li>
                              <a href="page-list-matierePrem.jsp">
                                <i class="bi bi-circle"></i>
                                <span>Liste matiere premiere</span>
                              </a>
                            </li><!-- front office -->
        </ul>
      </li><!-- End Forms Nav -->
      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#tables-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-layout-text-window-reverse"></i><span>Recherce</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="tables-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
<!--                 <li>
                <a href="testChart.jsp">
                  <i class="bi bi-circle"></i>
                  <span>TestChart</span>
                </a>
              </li> front office -->
                <li>
                <a href="RechercheBenefice.jsp">
                  <i class="bi bi-circle"></i>
                  <span>Benefice</span>
                </a>
              </li><!-- front office -->
              <li >
                <a href="page-recherche-poketra.jsp">
                 <i class="bi bi-circle"></i>
                  <span>Mitady poketra</span>
                </a>
              </li><!-- front office -->
                <li>
               <a  href="FiltreProduitFinie.jsp">
                <i class="bi bi-circle"></i>
                 <span>Filtre  Produit Finie</span>
               </a>
             </li>
             <li class="nav-item">
                  <a  href="getStat.jsp">
                    <i class="bi bi-circle"></i>
                    <span>Statistique</span>
                  </a>
             </li><!-- front office -->
        </ul>
      </li><!-- End Tables Nav -->
    </ul>

  </aside><!-- End Sidebar-->
  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Blank Page</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.jsp">Home</a></li>
          <li class="breadcrumb-item">Pages</li>
          <li class="breadcrumb-item active">Blank</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section">
      <div class="row">
        <div class="col-lg-12">

            <div class="container">

               
                  <div class="container">
                    <div class="row justify-content-center">
                      <div class="col-lg-4 col-md-6 d-flex flex-column align-items-center justify-content-center">
          
                        <div class="card mb-3">
          
                          <div class="card-body">
          
                            <div class="pt-4 pb-2">
                              <h5 class="card-title text-center pb-0 fs-4">Add a Vente</h5>
                              <p class="text-center small">Enter just the name of vente</p>
                            </div>
                              
                               <%if(request.getParameter("err") != null){ %>
                        <%=request.getParameter("err")%>
                     <%}%>
          
                            <form action="AjoutVente" class="row g-3 needs-validation" novalidate>
                              
                            <div class="col-12">
                                <label class="col-sm-2 col-form-label">Types</label>
                                <div class="col-12">
                                    <select name="id_type" class="form-select" aria-label="Default select example">
                                    <%for(Type type : types){%>
                                    <option value="<%=type.getId()%>"><%=type.getNom()%></option>
                                    <%}%>
                                  </select>
                                </div>
                            </div>
                                  
                            <div class="col-12">
                                <label class="col-sm-2 col-form-label">Client</label>
                                <div class="col-12">
                                    <select name="id_client" class="form-select" aria-label="Default select example">
                                    <%for(Client client : clients){%>
                                    <option value="<%=client.getId()%>"><%=client.getNom()%></option>
                                    <%}%>
                                  </select>
                                </div>
                            </div>
                                  
                            <div class="col-md-12">
                                <div class="form-floating">
                                    <input name="quantite" type="number" class="form-control" id="floatingName" placeholder="Nom Look" required>
                                    <label for="floatingName">Quantite</label>
                                </div>
                            </div>
                                  
                            <div class="col-md-12">
                                <div class="form-floating">
                                    <input name="date" type="date" class="form-control" id="floatingName" placeholder="Nom Look" required>
                                    <label for="floatingName">Date</label>
                                </div>
                            </div>
          
                           
                              <div class="col-12">
                                
                              </div>
                              <div class="col-12">
                                <button class="btn btn-primary w-100" type="submit">Add Genre</button>
                              </div>
                              
                            </form>
          
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
              </div>
        </div>

      </div>
    </section>

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">
    <div class="copyright">
      &copy; Copyright <strong><span>NiceAdmin</span></strong>. All Rights Reserved
    </div>
    <div class="credits">
      <!-- All the links in the footer should remain intact. -->
      <!-- You can delete the links only if you purchased the pro version. -->
      <!-- Licensing information: https://bootstrapmade.com/license/ -->
      <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->
      Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
    </div>
  </footer><!-- End Footer -->

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

</body>

</html>