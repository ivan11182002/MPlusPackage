var app = angular.module('App', ['ui.router']);


//app.filter('unique', function () {
//    return function (collection, keyname) {
//        console.log(keyname);
//        var output = [],
//          keys = [];
//        angular.forEach(collection, function (item) {
//            var key = item[keyname];
//            if (keys.indexOf(key) === -1) {
//                keys.push(key);
//                output.push(item);
//            }
//        });
//        return output;
//    };
//});
//
//app.directive("fileread", [function () {
//    return {
//        scope: {
//            fileread: "="
//        },
//        link: function (scope, element, attributes) {
//            element.bind("change", function (changeEvent) {
//                scope.$apply(function () {
//                    if (changeEvent.target.files[0] != null) {
//                        scope.fileread = changeEvent.target.files[0].name;
//                    }
//                    // scope.fileread = changeEvent.target.files;
//                });
//            });
//        }
//    }
//}]);
//
//app.directive("changePreviewImg", [function () {
//    return {
//        scope: {
//            changePreviewImg: "="
//        },
//        link: function (scope, element, attributes) {
//            element.bind("change", function (changeEvent) {
//                var file = changeEvent.target.files[0];
//                if (file != null) {
//                    var reader = new FileReader();
//                    reader.onload = function (e) {
//                        scope.$apply(function () {
//                            scope.changePreviewImg = e.target.result;
//                        })
//                    }
//                    reader.readAsDataURL(file);
//                }
//            });
//        }
//    }
//}]);
//
//
//app.directive('restrictTo', function() {
//    return {
//        restrict: 'A',
//        link: function (scope, element, attrs) {
//            
//            var re = RegExp(attrs.restrictTo);
//            var exclude = /Backspace|Enter|Tab|Delete|Del|ArrowUp|Up|ArrowDown|Down|ArrowLeft|Left|ArrowRight|Right/;
//
//            element[0].addEventListener('keydown', function(event) {
//                if (!exclude.test(event.key) && !re.test(event.key)) {
//                    event.preventDefault();
//                }
//            });
//        }
//    }
//});