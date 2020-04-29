
#import <Foundation/Foundation.h>
#import <Cordova/CDVPlugin.h>


@interface OpenNativeView : CDVPlugin {
    int recordingStatus;
    // Member variables go here.
}
@property (strong, nonatomic) UIWindow *window;
@property (strong, nonatomic) NSString *callid;
@property (strong, nonatomic) NSString *userName;
@property (nonatomic, assign) BOOL isCallBusy;


- (void)open:(CDVInvokedUrlCommand*)command;

@end
