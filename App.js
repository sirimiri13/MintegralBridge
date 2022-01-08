/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

 import React, { Component } from 'react';
 import type {Node} from 'react';
 import {
   Button,
   StyleSheet,
   Text,
   View,
   NativeModules,
   Platform
 } from 'react-native';
 
 
 export default class App extends Component{
   render(){
     return (
       <View style = {styles.container}>
         <Button title='Show Ads' onPress={() =>{
           if (Platform.OS == "ios"){
             console.log("ios");
             NativeModules.MintegralIOS.addAds();
           }else {
            console.log("android");
            NativeModules.MintegralAndroid.addAds();
           }
         }}/>
       </View>
     )
   }
 }
 
 const styles = StyleSheet.create(
   {
       container: {
         flex:1,
         justifyContent: "center",
         alignItems : "center",
         backgroundColor: "#F5FCFF",
       }
   }
 )