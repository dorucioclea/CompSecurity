.class synthetic Lcom/facebook/l/g;
.super Ljava/lang/Object;
.source "MusicPresenceHandler.java"


# static fields
.field static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 188
    invoke-static {}, Lcom/facebook/push/mqtt/cj;->values()[Lcom/facebook/push/mqtt/cj;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/facebook/l/g;->a:[I

    :try_start_0
    sget-object v0, Lcom/facebook/l/g;->a:[I

    sget-object v1, Lcom/facebook/push/mqtt/cj;->CHANNEL_CONNECTED:Lcom/facebook/push/mqtt/cj;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/cj;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
