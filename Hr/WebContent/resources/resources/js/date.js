$(document).ready(function(){


    //    date of birth

    $( "#datepicker" ).datepicker();

    $(".skill-button").click(function() {
        var newRow = $('.skill-cate tr:last').clone(true);
        newRow.find('td:first-child span').text(function(i, oldText) {
            return parseInt(oldText, 10) + 1;
        });

        newRow.find('input:text').val('');
        $('.skill-cate').append(newRow);
    });

    $(".education-button").click(function() {
        var newRow = $('.education-cate tr:last').clone(true);
        newRow.find('td:first-child span').text(function(i, oldText) {
            return parseInt(oldText, 10) + 1;
        });

        newRow.find('input:text').val('');
        $('.education-cate').append(newRow);
    });


    $(".certification-button").click(function() {
        var newRow = $('.certification-cate tr:last').clone(true);
        newRow.find('td:first-child span').text(function(i, oldText) {
            return parseInt(oldText, 10) + 1;
        });

        newRow.find('input:text').val('');
        $('.certification-cate').append(newRow);
    });

    $(".work-button").click(function() {
        var newRow = $('.work-cate tr:last').clone(true);
        newRow.find('td:first-child span').text(function(i, oldText) {
            return parseInt(oldText, 10) + 1;
        });

        newRow.find('input:text').val('');
        $('.work-cate').append(newRow);
    });



    $(".container").on('click', '.add-new-skill', function () {

        $(".added-skill").append('<div class="col-md-12"><div class="col-md-6"><label for="skill-category">Skill name:</label><input type="text" class="form-control skillName" placeholder="e.g English" id="skill-category" name="skill-category"></div><div class="col-md-3"><label for="target">Skill level:</label><br><select class="target skillLevel"><option value="Elementary">Elementary</option><option value="Limited">Limited</option><option value="Professional">Professional</option><option value="Full">Full</option><option value="Native">Native</option> </select></div></div>');
        return false;
    });




    $('#verborgen_file').hide();
    $('#uploadButton').on('click', function () {
        $('#verborgen_file').click();
    });

    $('#verborgen_file').change(function () {
        $('#pf-foto-hidden').hide();
        var file = this.files[0];
        var reader = new FileReader();
        reader.onloadend = function () {
            $('#pf_foto').css('background-image', 'url("' + reader.result + '")');
        }
        if (file) {
            reader.readAsDataURL(file);
        } else {
        }
    });




    /*login and registration buttons function*/

    // Get the modal


    employeePopup();

    companyPopup();

    //        companyAlarmPopup();

    // When the user clicks anywhere outside of the modal, close it

    function employeePopup(){

        var modal1 = document.getElementById('id01');

        window.onclick = function(event) {
            if (event.target == modal1) {
                modal1.style.display = "none";
            }
        };

    };



    function companyPopup(){

        var modal2 = document.getElementById('id02');
        window.onclick = function(event) {
            if (event.target == modal2) {
                modal2.style.display = "none";
            }
        };

    };



    function companyAlarmPopup(){

        var companyModal = document.getElementById('companyPopup');
        window.onclick = function(event) {
            if (event.target == companyModal) {
                companyModal.style.display = "none";
            }
        };

    };







});



