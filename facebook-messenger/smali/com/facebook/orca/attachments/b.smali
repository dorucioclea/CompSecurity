.class final Lcom/facebook/orca/attachments/b;
.super Ljava/lang/Object;
.source "AudioAttachmentData.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/attachments/AudioAttachmentData;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/attachments/AudioAttachmentData;
    .locals 2

    .prologue
    .line 41
    new-instance v0, Lcom/facebook/orca/attachments/AudioAttachmentData;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/attachments/AudioAttachmentData;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/attachments/b;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/attachments/AudioAttachmentData;
    .locals 1

    .prologue
    .line 45
    new-array v0, p1, [Lcom/facebook/orca/attachments/AudioAttachmentData;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/facebook/orca/attachments/b;->a(Landroid/os/Parcel;)Lcom/facebook/orca/attachments/AudioAttachmentData;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/facebook/orca/attachments/b;->a(I)[Lcom/facebook/orca/attachments/AudioAttachmentData;

    move-result-object v0

    return-object v0
.end method
