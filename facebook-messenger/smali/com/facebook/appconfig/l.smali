.class public Lcom/facebook/appconfig/l;
.super Ljava/lang/Object;
.source "AppConfigPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/prefs/shared/aj;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "app_info/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/appconfig/l;->a:Lcom/facebook/prefs/shared/ae;

    .line 16
    sget-object v0, Lcom/facebook/appconfig/l;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_fetch_time_ms"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/appconfig/l;->b:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/appconfig/l;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "app_info_data"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/appconfig/l;->c:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
