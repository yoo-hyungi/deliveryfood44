
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import PayPaymentHistoryManager from "./components/listers/PayPaymentHistoryCards"
import PayPaymentHistoryDetail from "./components/listers/PayPaymentHistoryDetail"

import StoreOrderManagementManager from "./components/listers/StoreOrderManagementCards"
import StoreOrderManagementDetail from "./components/listers/StoreOrderManagementDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },

            {
                path: '/pays/paymentHistories',
                name: 'PayPaymentHistoryManager',
                component: PayPaymentHistoryManager
            },
            {
                path: '/pays/paymentHistories/:id',
                name: 'PayPaymentHistoryDetail',
                component: PayPaymentHistoryDetail
            },

            {
                path: '/stores/orderManagements',
                name: 'StoreOrderManagementManager',
                component: StoreOrderManagementManager
            },
            {
                path: '/stores/orderManagements/:id',
                name: 'StoreOrderManagementDetail',
                component: StoreOrderManagementDetail
            },




    ]
})
