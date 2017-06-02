app.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/');

    $stateProvider
        .state('new', {
            url: '/',
            templateUrl: 'resources/Apps/Test/NewFile.html',
            controller: 'TestController'
        })
        .state('myGod', {
            url: '/myGod',
            templateUrl: 'resources/Apps/Test2/NewFile2.html',
            controller: 'TestController2'
        })
}])

